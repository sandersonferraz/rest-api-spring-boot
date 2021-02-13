package br.com.restapispringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.restapispringboot.model.Client;
import br.com.restapispringboot.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client> listAll() {
		return clientRepository.findAll();

	}
	
	@PostMapping
	public Client setClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
