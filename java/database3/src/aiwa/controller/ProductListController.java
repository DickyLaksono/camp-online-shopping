package aiwa.controller;

import java.util.Scanner;

import aiwa.model.ProductModel;
import aiwa.view.ProductListView;

public class ProductListController {

	public static void main(String[] args) {

		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);

		ProductModel pm = new ProductModel();
		ProductListView view = new ProductListView();

		System.out.println("**** 商品検索 ****");
		System.out.println("1:全件 2:名前 3:ID");

		int menu = scanInt.nextInt();
		if (menu == 1) {
			view.show(pm.findAll());

		} else if (menu == 2) {
			System.out.println("キーワードを入力してください");
			String word = scanStr.nextLine();
			view.show(pm.findByName(word));

		} else if (menu == 3) {
			System.out.println("IDを入力してください");
			int id = scanInt.nextInt();
			view.show(pm.findByiD(id));
		}
	}

}
