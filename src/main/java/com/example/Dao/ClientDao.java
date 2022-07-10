package com.example.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.Entities.Client;

public interface ClientDao extends CrudRepository<Client, Long>{

}
