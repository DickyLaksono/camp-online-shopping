package aiwa.model;

import java.util.ArrayList;

import aiwa.database.UserTable;
import aiwa.entity.User;

public class UserModel {

	/*public static void main(String[] args) {
		UserModel um = new UserModel();
	
		User u = um.findById(1);
	
		//null check
		if (u != null) {
			System.out.println(u.getId() + ": " + u.getName());
	
		} else {
			System.out.println("見つかりませんでした");
		}
	
				//ArrayList<User> users = um.findByAge(20, 29);
		
				//for (User u : users) {
				//System.out.println(u.getName() + " " + u.getAge());
				//}
	
	}*/

	public ArrayList<User> findByName(String keyword) {
		ArrayList<User> result = new ArrayList<>();

		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();

		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			String name = u.getName();
			if (name.contains(keyword)) {
				result.add(u);
			}

		}

		return result;
	}

	public ArrayList<User> findByType(int type) {
		ArrayList<User> result = new ArrayList<>();

		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();

		for (User u : users) {
			if (u.getType() == type) {
				result.add(u);
			}

		}

		return result;
	}

	public ArrayList<User> findByAge(int min, int max) {
		ArrayList<User> result = new ArrayList<>();

		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();

		for (User u : users) {

			if (u.getAge() >= min && u.getAge() <= max) {
				result.add(u);
			}
		}

		return result;
	}

	public User findById(int id) {

		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();

		for (User u : users) {
			if (u.getId() == id) {
				return u;

			}
		}
		return null;// jika tidak ada yang harus di kembalikan masukkan null

	}
}
