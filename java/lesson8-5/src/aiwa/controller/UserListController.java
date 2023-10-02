package aiwa.controller;

import java.util.ArrayList;
import java.util.Scanner;

import aiwa.entity.User;
import aiwa.model.UserModel;
import aiwa.view.UserListView;

public class UserListController {

	public static void main(String[] args) {

		Scanner scanInt = new Scanner(System.in);
		Scanner scanStr = new Scanner(System.in);

		UserModel um = new UserModel();// mencari dari model 
		UserListView view = new UserListView();// lalu menyuruh view untuk melakukan pekerjaan nya
		ArrayList<User> users = new ArrayList<User>();
		//ArrayList<User> users ini adalah return dari findByName (karena memiliki return arraylist)

		System.out.println("**** ユーザ管理システム ****");

		System.out.println("1:名前 2:年齢 3:タイプ 4;ID ");
		int menu = scanInt.nextInt();

		if (menu == 1) {
			System.out.println("キーワードを入力してください");
			String keyword = scanStr.next();

			users = um.findByName(keyword);

		} else if (menu == 2) {
			System.out.println("年齢(最小)を入力してください");
			int min = scanInt.nextInt();

			System.out.println("年齢(最大)を入力してください");
			int max = scanInt.nextInt();

			users = um.findByAge(min, max);

		} else if (menu == 3) {
			System.out.println("1:account 2:page 3:group");
			int type = scanInt.nextInt();

			users = um.findByType(type);

		} else if (menu == 4) {
			System.out.println("ID を入力してください");
			int id = scanInt.nextInt();

			User u = um.findById(id);
			if (u != null) {
				users.add(u);

			}
		}
		view.show(users);

	}

}
