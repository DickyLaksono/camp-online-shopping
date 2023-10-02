package aiwa.controller;

import java.util.List;

import aiwa.entity.Employee;
import aiwa.model.EmployeeModel;

public class EmployeeListController {

	public static void main(String[] args) {
		System.out.println("-------- 社員リスト ------");
		EmployeeModel em = new EmployeeModel();
		List<Employee> list = em.findAll();

		EmployeeListView view = new EmployeeListView();
		view.show(list);

	}

}
