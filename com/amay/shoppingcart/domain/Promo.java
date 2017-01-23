/**
 *  Model for Promo
 * 
 */
package com.amay.shoppingcart.domain;
public class Promo {
	
	private String promoCode;
	
	private double discount;
	
	

	public double getDiscount() {
		
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getPromoCode() {
		
		return promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode =promoCode;
	}
	
	

}
