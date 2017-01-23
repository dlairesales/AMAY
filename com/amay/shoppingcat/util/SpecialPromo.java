package com.amay.shoppingcat.util;

import java.util.List;

import com.amay.shoppingcart.domain.Product;

public class SpecialPromo {
	/**
	 * Method for additional Promo products
	 * @param product
	 * @param list
	 * @param promoCode
	 * @return
	 */
	public List<Product>  additionalProduct(Product product,List<Product> list,String promoCode) {
		
		if (product.getProductCode().equals("ult_medium")){
			Product freeProduct= new Product("1gb","1gb DataPack",0,product.getProductQty());
			freeProduct.setPromoCode(promoCode);
			list.add(freeProduct);
			
		}
		
		return list;
	}

}
