package br.com.restapispringboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity // DEFINIMOS COMO UMA ENTIDADE QUE SERÁ MAPEADA NUMA TABELA
public class Client {
	@Id // DEFINIMOS COMO UMA COLUNA ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // DELEGAMOS AO BANCO DE DADOS A TAREFA DE AUTOINCREMENT 
	private Long id;
	
	@Column(nullable = false)
	private String name;
	

}
