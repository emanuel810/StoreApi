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
import com.example.Entities.Product;
import com.example.Services.ProductServices;

@RestController
@RequestMapping("/Product")
public class ProductController{

	@Autowired
	ProductServices service;
	
	@GetMapping()
	public List<Product> list(){
		return service.list();
	}
	
	@GetMapping(value = "/{id}")
	public Product search(@PathVariable Long id) {
		return service.search(id);
	}
	
	@PostMapping()
	public Product add(@RequestBody Product product) {
		product.setProduct_id(null);
		return service.add(product);
	}
	
	@PutMapping(value = "/{id}")
	public Product update(@PathVariable Long id, @RequestBody Product product) {
		return service.update(id, product);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
