package com.example.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Cart;

public interface CartDao extends CrudRepository<Cart, Long>{

}
