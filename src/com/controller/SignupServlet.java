package com.controller;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class SignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");

		// validation

		Pattern p = Pattern.compile("^[a-zA-Z]\\w{2,15}$");
		Matcher m = p.matcher(firstName);

		System.out.println(m.matches());// firstname is correct - true

		UserBean user = new UserBean();
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setPassword(password);
		user.setGender(gender);

		UserDao userDao = new UserDao();
		userDao.addUser(user);

		response.sendRedirect("Login.jsp");

	}

}
