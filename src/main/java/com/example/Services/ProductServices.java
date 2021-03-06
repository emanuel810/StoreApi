package com.example.Services;

import java.util.List;

import com.example.Entities.Product;

public interface ProductServices {
	List<Product> list();
	Product search(Long id);
	Product add(Product product);
	Product update(Long id, Product product);
	void delete(Long id);
}
