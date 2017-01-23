/**
 * Implementation of ShoppingCart interface
 */
package com.amay.shoppingcart.dao;

import java.util.ArrayList;
import java.util.List;

import com.amay.shoppingcart.domain.Product;
import com.amay.shoppingcart.domain.Promo;
import com.amay.shoppingcart.domain.ShoppingCart;
import com.amay.shoppingcat.util.PriceRules;

public class ShoppingCartDAOImpl implements ShoppingCartDAO {

	Promo promo = new Promo();

	/**
	 * Method to AddItems On Cart
	 */
	@Override
	public List<ShoppingCart> addItemCart(ShoppingCart product) {
		List<ShoppingCart> shoppingCartItemList = new ArrayList<ShoppingCart>();
		product.setProductCode(product.getProductCode());
		product.setProductPrice(product.getProductPrice());
		product.setProductName(product.getProductName());
		product.setProductQty(product.getProductQty());
		product.setPromoCode(product.getPromoCode());
		shoppingCartItemList.add(product);
		return shoppingCartItemList;
	}
	/**
	 *Method to Get the Total amount per transactions 
	 */
	@Override
	public ShoppingCart getTotal(ShoppingCart cart) {
		double total = 0;
		double promoTotal = 0;
		promo.setPromoCode("1<3AMAYSIM");
		promo.setDiscount(0.1);
		PriceRules priceRules = new PriceRules();
		for (Product product : cart.getProductList()) {
			priceRules.updatePriceRules(product);
			//Condition for Promo codes
			if (product.getPromoCode().equals(promo.getPromoCode())) {
				promoTotal = product.getProductPrice() - (product.getProductPrice() * promo.getDiscount());
				total = total + (promoTotal);
			} else {
				total = total + (product.getProductPrice());
			}
		}
		cart.setTotal(Math.round(total * 100.0) / 100.0);
		return cart;
	}

}
