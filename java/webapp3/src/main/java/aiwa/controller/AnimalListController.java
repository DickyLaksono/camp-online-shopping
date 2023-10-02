package aiwa.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiwa.entity.Animal;

@WebServlet("/AnimalListController")
public class AnimalListController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//		RequestDispatcher rd = request.getRequestDispatcher("/animalListView.jsp");
		//		rd.forward(request, response);

		List<Animal> animals = findALL();
		request.setAttribute("animals", animals);
		request.getRequestDispatcher("/animalListView.jsp").forward(request, response);

	}

	private List<Animal> findALL() {
		List<Animal> result = new ArrayList<>();

		Animal a1 = new Animal(1, "ライオン", 2.5, 200,
				"https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG4IRgZdv9EwHEoP8O0cov7cP-exZ-24UX98A_XultMjYYLYldR8Re4gSWmXaRFu958fMgwExEzuIp8vIqulOG6Jy3E3aklUrCGV6GMn9eor4JHlMz3Zr8M4RgSHk9yhqhLSj6gASikN8uflj83ehWLYdFfyF2TlD1zra-aqmEIjKruVlqmh6szijUy3IND5GcQIYZSFpi9w6aae_cQLK7iM=/lion_male.png?errorImage=false");
		result.add(a1);
		Animal a2 = new Animal(1, "猫", 1.5, 100,
				"https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG1YfHDoq6bKpfOed4CmrTfIuP0MIL2eao3y4kldmjDFnN94lzu41Pit98hDxd_shkhN4Pq1PycRG-nxYzgdvp7dgKr9GAGxt1RHHJBpUhB7Wixi52jY-z3sVkHN_Css-F5J3K2myHTFPewMl3ND5ArKBsEaYZbQAOqzfnw-cFVXzSYV9un8FzCP1g62D_PTxXgqquUfS_GO2rqpQBrIJLUCFz6sL94OLvtga3gP2Xk3Me9MtIbM4TMB-3KGRjixnTINk1FqJ9eE0Kz8G6BZUDmg=/img_7e0b8adba77c91687a8078920dedc7be160077.jpg?errorImage=false");
		result.add(a2);
		Animal a3 = new Animal(1, "熊", 4.5, 350,
				"https://msp.c.yimg.jp/images/v2/FUTi93tXq405grZVGgDqG6NNVN64eNHc-am8xgXqwhswald7K3EQlXwrvb1XAj6uEqSgAAEMSctEvgEZFrZ1M-F217YXM5Ywl8eFzVuod5RwrmQyxGbxXRaU3bkbmml6rQ9SQI3naPY6e_ajeInB-auqvAeH5OD8pqONaq01211oTj5b248QHvoPxkP7eKfMhpbE9kCh1atPaIWdB7ulzxzLPEnX8DqX-i9lYmZyJ5_YDoN1ev5A-Z7USLAJW_4B5N1zAcEOxXEQv9tGUCBw9LXEDAoT9sK88RyEiSCNJB-KHrnpAPyLCZPJRUB9xAzkbTJ6gj8JS0s1hG8wAJAF-A==/large.jpg?errorImage=false");
		result.add(a3);

		return result;
	}

}
