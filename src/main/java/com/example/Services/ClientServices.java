package com.example.Services;

import java.util.List;

import com.example.Entities.Client;

public interface ClientServices {
	List<Client> list();
	Client search(Long id);
	Client add(Client cart);
	Client update(Long id, Client cart);
	void delete(Long id);
}
