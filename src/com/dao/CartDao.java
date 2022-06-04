package com.dao;

import java.util.ArrayList;

import com.bean.CartBean;

public class CartDao {

	public static ArrayList<CartBean> carts = new ArrayList<CartBean>();
	
	
	public void addCart(CartBean cart) {
		carts.add(cart);//userId productId
	}
	
}
