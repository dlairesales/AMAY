/**
 * Main Class run For testing
 */
package com.amay.shoppingcart.main;

import java.util.ArrayList;
import java.util.List;

import com.amay.shoppingcart.dao.ShoppingCartDAO;
import com.amay.shoppingcart.dao.ShoppingCartDAOImpl;
import com.amay.shoppingcart.domain.Product;
import com.amay.shoppingcart.domain.ShoppingCart;
import com.amay.shoppingcat.util.SpecialPromo;

public class MainApp {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		ShoppingCartDAO dao = new ShoppingCartDAOImpl();
		List<Product> list = new ArrayList<Product>();
		SpecialPromo specialPromo = new SpecialPromo();
		Product product = new Product("ult_small", "Unlimited 1GB", 24.90, 3);
		product.setPromoCode("");
		list.add(product);
		specialPromo.additionalProduct(product, list, product.getPromoCode());
		Product product2 = new Product("ult_large", "Unlimited 5GB", 44.90, 1);
		product2.setPromoCode("");
		list.add(product2);
		specialPromo.additionalProduct(product2, list, product2.getPromoCode());
		dao.addItemCart(cart);
		cart.setProductList(list);
		dao.getTotal(cart);
		System.out.println("Scenario 1:" + cart);

		ShoppingCart cart2 = new ShoppingCart();
		List<Product> list2 = new ArrayList<Product>();
		Product product3 = new Product("ult_small", "Unlimited 1GB", 24.90, 2);
		product3.setPromoCode("");
		list2.add(product3);
		specialPromo.additionalProduct(product3, list2, product3.getPromoCode());
		Product product4 = new Product("ult_large", "Unlimited 5GB", 44.90, 4);
		product4.setPromoCode("");
		list2.add(product4);
		specialPromo.additionalProduct(product4, list2, product4.getPromoCode());
		dao.addItemCart(cart2);
		cart2.setProductList(list2);
		dao.getTotal(cart2);
		System.out.println("Scenario 2:" + cart2);

		ShoppingCart cart3 = new ShoppingCart();
		List<Product> list3 = new ArrayList<Product>();
		Product product5 = new Product("ult_small", "Unlimited 1GB", 24.90, 1);
		product5.setPromoCode("");
		list3.add(product5);
		specialPromo.additionalProduct(product5, list3, product5.getPromoCode());
		Product product6 = new Product("ult_medium", "Unlimited 2GB", 29.90, 2);
		product6.setPromoCode("");
		list3.add(product6);
		specialPromo.additionalProduct(product6, list3, product6.getPromoCode());
		dao.addItemCart(cart3);
		cart3.setProductList(list3);
		dao.getTotal(cart3);
		System.out.println("Scenario 3:" + cart3);

		ShoppingCart cart4 = new ShoppingCart();
		List<Product> list4 = new ArrayList<Product>();
		Product product7 = new Product("ult_small", "Unlimited 1GB", 24.90, 1);
		product7.setPromoCode("1<3AMAYSIM");
		list4.add(product7);
		specialPromo.additionalProduct(product7, list4, product7.getPromoCode());
		Product product8 = new Product("1gb", "1gb DataPack", 9.90, 1);
		product8.setPromoCode("1<3AMAYSIM");
		list4.add(product8);
		specialPromo.additionalProduct(product8, list4, product8.getPromoCode());
		dao.addItemCart(cart4);
		cart4.setProductList(list4);
		dao.getTotal(cart4);
		System.out.println("Scenario 4:" + cart4);

	}

}