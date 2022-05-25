package com.dao;

import java.util.ArrayList;

import com.bean.UserBean;

public class UserDao {

	private static ArrayList<UserBean> users = new ArrayList<UserBean>();

	static {
		UserBean user = new UserBean();
		user.setFirstName("Admin");
		user.setRole("admin");
		user.setGender("male");
		user.setEmail("admin@ecom.com");
		user.setPassword("admin123");

		UserBean user1 = new UserBean();
		user1.setFirstName("Ram");
		user1.setRole("customer");
		user1.setGender("male");
		user1.setEmail("ram@ecom.com");
		user1.setPassword("ram123");

		users.add(user);
		users.add(user1);

	}

	public void addUser(UserBean user) {
		this.users.add(user);
	}

	public ArrayList<UserBean> getAllUsers() {
		return this.users;
	}

	public UserBean authenticate(String email, String password) {

		for (UserBean user : this.users) {// i=0 i<users.size i++
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equals(password)) {
				return user;
			}
		}

		return null;
	}
}
