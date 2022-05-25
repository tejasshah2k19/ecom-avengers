package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation email and password present

		// authentication
		// user email and password correct
		UserDao userDao = new UserDao();
		UserBean user = userDao.authenticate(email, password);

		RequestDispatcher rd = null;

		if (user == null) {
			request.setAttribute("error", "Invalid Credentials");
			rd = request.getRequestDispatcher("Login.jsp");
		} else {
			request.setAttribute("msg", "Loggedin");
			if (user.getRole().equals("admin")) {
				rd = request.getRequestDispatcher("Dashboard.jsp");
			} else if (user.getRole().equals("customer")) {
				rd = request.getRequestDispatcher("Home.jsp");
			} else {
				request.setAttribute("error", "Please Contact Admin");
				rd = request.getRequestDispatcher("Login.jsp");
			}
		}

		rd.forward(request, response);

	}

}
