package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.CartBean;
import com.dao.CartDao;

@WebServlet("/AddToCartServlet")
public class AddToCartServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));
		int userId = Integer.parseInt(request.getParameter("userId"));

		CartBean cart = new CartBean();
		cart.setProductId(productId);
		cart.setUserId(userId);

		CartDao cartDao = new CartDao();
		cartDao.addCart(cart);
		
		response.sendRedirect("Home.jsp");

	}
}
