package aiwa.database;

import java.util.ArrayList;

import aiwa.entity.User;

public class UserTable {

	//dibutuhkan import untuk menggunakannya
	//untuk mengetest nya tinggal memasukkan main method nya saja

	public static void main(String[] args) {
		UserTable ut = new UserTable();
		ArrayList<User> users = ut.getData();
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			System.out.println(u.getAge());

		}
	}

	public ArrayList<User> getData() {
		ArrayList<User> users = new ArrayList<>();

		User u1 = new User();
		u1.setId(1);
		u1.setName("エルノビユッセフ");
		u1.setAge(22);
		u1.setType(1);

		User u2 = new User();
		u2.setId(2);
		u2.setName("ヌウェウーカイ");
		u2.setAge(23);
		u2.setType(1);

		User u3 = new User();
		u3.setId(3);
		u3.setName("ダット");
		u3.setAge(23);
		u3.setType(1);

		User u4 = new User();
		u4.setId(4);
		u4.setName("タイ");
		u4.setAge(27);
		u4.setType(1);

		User u5 = new User();
		u5.setId(5);
		u5.setName("愛和システムエンジニア専門");
		u5.setAge(0);
		u5.setType(2);

		User u6 = new User();
		u6.setId(5);
		u6.setName("愛和外語学院");
		u6.setAge(0);
		u6.setType(2);

		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u6);

		return users;
	}
}
