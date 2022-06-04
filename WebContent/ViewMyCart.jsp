<%@page import="com.dao.CartDao"%>
<%@page import="com.bean.ProductBean"%>
<%@page import="com.dao.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ecom : MyCart</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<jsp:include page="CustomerHeader.jsp"></jsp:include>

	<%
		int userId = -1;
		Cookie c[] = request.getCookies();
		for (int i = 0; i < c.length; i++) {
			if (c[i].getName().equals("userId")) {
				userId = Integer.parseInt(c[i].getValue());
			}
		}
		System.out.println("currentUSer => " +userId);
		System.out.println("size => " +CartDao.carts.size());
		
	%>
	<div class="container">
		<br> <br> <br>
		<%
			for (int i = 0; i < CartDao.carts.size(); i++) {
				System.out.println("userID = > "+ CartDao.carts.get(i).getUserId());
				
				if (CartDao.carts.get(i).getUserId() != userId) {
					continue;
				}
		%>

		<%=CartDao.carts.get(i).getProductId()%><br>

		<%
			 
			}
		%>
	</div>
</body>
</html>