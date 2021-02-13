package br.com.restapispringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.restapispringboot.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long > {
	
	

}
