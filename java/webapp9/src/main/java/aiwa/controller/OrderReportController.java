package aiwa.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import aiwa.entity.Order;
import aiwa.entity.user;
import aiwa.model.OrderModel;

@WebServlet("/OrderReportController")
public class OrderReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
		String time = f.format(new Date());

		response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
		response.setHeader("content-disposition", "attachment; filename=\"OrderReportOutput_" + time + ".xlsx\"");
		response.setCharacterEncoding("UTF-8");

		// Session
		HttpSession session = request.getSession();
		user u = (user) session.getAttribute("loginuser");
		if (u == null) {
			response.sendRedirect("Login.jsp");
			return;
		}
		// Parameter 

		// model
		OrderModel om = new OrderModel(getServletContext());
		List<Order> orders = om.findByUser(u);

		// Download
		try (Workbook book = WorkbookFactory
				.create(new File(getServletContext().getRealPath("WEB-INF/OrderReport.xlsx")));
				OutputStream out = response.getOutputStream()) {

			Sheet sheet = book.getSheet("請求書");

			// Invoice no
			Row row = sheet.getRow(2);
			Cell cell = row.getCell(7);
			UUID uuid = UUID.randomUUID();//**** UUID ini untuk membuat anka secara random
			cell.setCellValue(uuid.toString().substring(0, 9));

			// 請求日
			row = sheet.getRow(3);
			cell = row.getCell(7);
			SimpleDateFormat f2 = new SimpleDateFormat("yyyy年MM月dd日");
			cell.setCellValue(f2.format(new Date()));

			// User Name
			row = sheet.getRow(3);
			cell = row.getCell(1);
			cell.setCellValue(u.getUserName() + " 様");

			// 支払い期限
			row = sheet.getRow(11);
			cell = row.getCell(2);
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, 7);
			Date date = calendar.getTime();
			cell.setCellValue(f2.format(date));

			int i = 15;
			for (Order o : orders) {
				row = sheet.getRow(i++);
				cell = row.getCell(1);
				cell.setCellValue(o.getItem().getItemname());
				cell = row.getCell(3);
				cell.setCellValue(o.getAmount());
				cell = row.getCell(4);
				cell.setCellValue("個");
				cell = row.getCell(5);
				cell.setCellValue(o.getItem().getPrice());

				if (i > 29) {
					break;
				}
			}

			book.setForceFormulaRecalculation(true);
			book.write(out);// Dengan ini proses download nya berjalan

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
