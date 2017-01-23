/** 
 * Util for Pricng Rules
 * 
 */
package com.amay.shoppingcat.util;

import com.amay.shoppingcart.domain.Product;

public class PriceRules {
	/**
	 * Method to update Price based on Rules and Product Code Conditions
	 * @param product
	 * @return
	 */
	public Product updatePriceRules(Product product) {

		switch (product.getProductCode()) {
			
			case "ult_small":
				if (product.getProductQty() == 3) {
					product.setProductPrice(product.getProductPrice() * 2);
				} else {
					product.setProductPrice(product.getProductPrice() * product.getProductQty());
				}

				break;
			case "ult_large":
				if (product.getProductQty() > 3) {
					product.setProductPrice(product.getProductQty() * 39.90);
				} else {
					product.setProductPrice(product.getProductPrice() * product.getProductQty());
				}

				break;
			case "ult_medium":
				product.setProductPrice(product.getProductPrice() * product.getProductQty());

				break;
			default:
				break;
		}
		return product;

	}
}
