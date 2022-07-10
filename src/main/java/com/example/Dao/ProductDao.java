package com.example.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Product;

public interface ProductDao extends CrudRepository<Product, Long>{

}
