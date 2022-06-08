package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.OrderBean;
import com.dao.CartDao;
import com.dao.OrdreDao;

@WebServlet("/CheckoutServlet")
public class CheckoutServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		for (int i = 0; i < CartDao.carts.size(); i++) {
			if (CartDao.carts.get(i).getUserId() == userId) {

				OrderBean orderBean = new OrderBean();
				orderBean.setUserId(userId);
				orderBean.setProductId(CartDao.carts.get(i).getProductId());
				OrdreDao.orders.add(orderBean);
				CartDao.carts.remove(i);
				i--;
			}
		}

		response.sendRedirect("ViewMyCart.jsp");
	}
}
