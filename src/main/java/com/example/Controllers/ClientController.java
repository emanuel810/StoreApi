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
import com.example.Entities.Client;
import com.example.Services.ClientServices;


@RestController
@RequestMapping("/Client")
public class ClientController {

	
	@Autowired
	ClientServices service;
	
	@GetMapping()
	public List<Client> list(){
		return service.list();
	}
	
	@GetMapping(value = "/{id}")
	public Client search(@PathVariable Long id) {
		return service.search(id);
	}
	
	@PostMapping()
	public Client add(@RequestBody Client client) {
		client.setClient_id(null);
		return service.add(client);
	}
	
	@PutMapping(value = "/{id}")
	public Client update(@PathVariable Long id, @RequestBody Client client) {
		return service.update(id, client);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
