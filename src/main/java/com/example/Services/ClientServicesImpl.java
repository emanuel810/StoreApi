package com.example.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Dao.CartDao;
import com.example.Dao.ClientDao;
import com.example.Entities.Cart;
import com.example.Entities.Client;

public class ClientServicesImpl implements ClientServices {


	@Autowired
	ClientDao dao;
	
	@Override
	public List<Client> list() {
		// TODO Auto-generated method stub
		return  (List<Client>) dao.findAll();
	}

	@Override
	public Client search(Long id) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) {
			Optional<Client> ob = dao.findById(id);
			return ob.get();
		}
		return null;
	}

	@Override
	public Client add(Client client) {
		// TODO Auto-generated method stub
		dao.save(client);
		return client;
	}

	@Override
	public Client update(Long id, Client client) {
		if(dao.existsById(id)) {
			client.setClient_id(id);
			dao.save(client);
		}
		return client;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		if(dao.existsById(id)) dao.deleteById(id);
	}

}
