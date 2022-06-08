package com.dao;

import java.util.ArrayList;

import com.bean.ProductBean;

public class ProductDao {

	public static ArrayList<ProductBean> products = new ArrayList<ProductBean>();

	static {
		ProductBean p1 = new ProductBean();
		p1.setCategory("phone");
		p1.setName("iphone 12");
		p1.setPrice(65000);
		p1.setQty(50);

		ProductBean p2 = new ProductBean();
		p2.setCategory("phone");
		p2.setName("iphone 13");
		p2.setPrice(85000);
		p2.setQty(50);

		ProductBean p3 = new ProductBean();
		p3.setCategory("phone");
		p3.setName("samsung galaxy 12");
		p3.setPrice(45000);
		p3.setQty(50);

		ProductBean p4 = new ProductBean();
		p4.setCategory("phone");
		p4.setName("realme 2 pro");
		p4.setPrice(13000);
		p4.setQty(50);

		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
	}

	public static ProductBean getProductDetailByProductId(int productId) {

		for (ProductBean p : products) {
			if (p.getProductId() == productId) {
				return p;
			}
		}

		return null;
	}

}
