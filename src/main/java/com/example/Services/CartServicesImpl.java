package com.example.Services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Dao.CartDao;
import com.example.Entities.Cart;


@Service
public class CartServicesImpl implements CartServices {

	
	@Autowired
	CartDao dao;
	
	@Override
	public List<Cart> list() {
		// TODO Auto-generated method stub
			return  (List<Cart>) dao.findAll();
	}

	@Override
	public Cart search(Long id) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) {
			Optional<Cart> ob = dao.findById(id);
			return ob.get();
		}////else throw new NotFoundException("No se encontró la mascota en la base de datos");
		return null;
	}

	@Override
	public Cart add(Cart cart) {
		// TODO Auto-generated method stub
		dao.save(cart);
		return cart;
	}

	@Override
	public Cart update(Long id, Cart cart) {
		if(dao.existsById(id)) {
			cart.setCart_id(id);
			dao.save(cart);
		}//else throw new NotFoundException("No se encontró la mascota en la base de datos");
		return cart;
	}

	@Override
	public void delete(Long id) {
		if(dao.existsById(id)) dao.deleteById(id);
		// TODO Auto-generated method stub
		
	}

}
