package com.example.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dao.ProductDao;
import com.example.Entities.Product;

@Service
public class ProductServicesImpl implements ProductServices{


	@Autowired
	private ProductDao dao;
	
	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return  (List<Product>) dao.findAll();
	}

	@Override
	public Product search(Long id) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) {
			Optional<Product> ob = dao.findById(id);
			return ob.get();
		}
		return null;
	}

	@Override
	public Product add(Product product) {
		// TODO Auto-generated method stub
		dao.save(product);
		return product;
	}

	@Override
	public Product update(Long id, Product product) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) {
			product.setProduct_id(id);
			dao.save(product);
		}
		return product;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) dao.deleteById(id);
	}

}
