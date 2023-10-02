package aiwa.view;

import java.util.ArrayList;

import aiwa.entity.Product;

public class ProductListView {

	public void show(Product product) {

		if (product != null) {
			System.out.println("-------------------");
			System.out.println("ID: " + product.getProductId());
			System.out.println("名前: " + product.getProductName());
			System.out.println("価格: " + product.getPrice());
		} else {
			System.out.println("Not found");
		}
	}

	public void show(ArrayList<Product> product) {

		if (product.size() > 0) {
			for (Product p : product) {

				show(p);
			}
		} else {
			System.out.println("Not Found .....");
		}
	}

}
