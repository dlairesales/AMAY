/**
 * Model for Product
 */
package com.amay.shoppingcart.domain;

public class Product extends Promo{
	
	private String productCode;
	
	private String productName;
	
	private double productPrice;
	
	private int productQty;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQty() {
		return productQty;
	}

	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	public Product(String productCode, String productName, double productPrice, int productQty) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQty = productQty;
	}
	
	public Product(){
		super();
	}

	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productQty=" + productQty + "]";
	}
	

}
