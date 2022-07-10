package com.example.Services;

import java.util.List;

import com.example.Entities.Cart;


public interface CartServices {
	List<Cart> list();
	Cart search(Long id);
	Cart add(Cart cart);
	Cart update(Long id, Cart cart);
	void delete(Long id);
}
