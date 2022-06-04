package com.bean;

public class CartBean {

	int cartId;// uniq
	int userId;
	int productId;

	public CartBean() {
		this.cartId = (int) (Math.random() * 1000000000);
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

}
