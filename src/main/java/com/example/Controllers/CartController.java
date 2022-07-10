package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entities.Cart;
import com.example.Services.CartServices;

@RestController
@RequestMapping("/Cart")
public class CartController {
	@Autowired
	CartServices service;
	
	@GetMapping()
	public List<Cart> list(){
		return service.list();
	}
	
	@GetMapping(value = "/{id}")
	public Cart search(@PathVariable Long id) {
		return service.search(id);
	}
	
	@PostMapping()
	public Cart add(@RequestBody Cart cart) {
		cart.setCart_id(null);
		return service.add(cart);
	}
	
	@PutMapping(value = "/{id}")
	public Cart update(@PathVariable Long id, @RequestBody Cart cart) {
		return service.update(id, cart);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
