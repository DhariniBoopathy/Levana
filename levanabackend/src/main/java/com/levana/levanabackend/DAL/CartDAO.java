package com.levana.levanabackend.DAL;

import java.util.List;

import com.levana.levanabackend.Model.Cart;




public interface CartDAO {
	
	boolean CreateCart(Cart cart);
	boolean UpdateCart(Cart cart);
	boolean DeleteCart(int id);
	List<Cart> SelectCart(int cartid);
    Cart showitem(int itemid);
}


