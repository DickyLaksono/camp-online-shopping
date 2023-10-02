package aiwa.view;

import java.util.ArrayList;

import aiwa.entity.User;

public class UserListView {

	/*public static void main(String[] args) {
	
		UserListView v = new UserListView();
		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();
	
		v.show(users);
	
	}*/

	public void show(ArrayList<User> users) {

		if (users.size() != 0) {
			for (User u : users) {

				System.out.println("----------------------------------");
				System.out.println("[ID  ]: " + u.getId());
				System.out.println("[NAME]: " + u.getName());

				if (u.getType() == 1) {
					System.out.println("[AGE ]: " + u.getAge() + " 才");
				}
				System.out.println("[TYPE]: " + u.getTypeName());
			}
		} else {

			System.out.println("見つかりませんでした。");

		}

	}
}
