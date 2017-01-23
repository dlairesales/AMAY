/**
 * Interface for Shooping Cart
 * 
 */
package com.amay.shoppingcart.dao;

import java.util.List;

import com.amay.shoppingcart.domain.ShoppingCart;

public interface ShoppingCartDAO {

	ShoppingCart getTotal(ShoppingCart cart);

	List<ShoppingCart> addItemCart(ShoppingCart product);

}
