/** 
 * Model For Shooping Cart
 */
package com.amay.shoppingcart.domain;

import java.util.List;

public class ShoppingCart extends Product {


	private double total;
	
	private List<Product> productList;

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "ShoppingCart [total=" + total + ", productList=" + productList + "]";
	}

	

}
