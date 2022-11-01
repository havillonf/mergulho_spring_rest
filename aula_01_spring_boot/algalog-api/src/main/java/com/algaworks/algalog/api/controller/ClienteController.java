package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteController {
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		Cliente cliente1 = new Cliente();
		
		cliente1.setId(1L);
		cliente1.setNome("João");
		cliente1.setTelefone("85 99122-1232");
		cliente1.setEmail("joao@email.com");
		
		Cliente cliente2 = new Cliente();
		
		cliente2.setId(1L);
		cliente2.setNome("Maria");
		cliente2.setTelefone("85 98272-1232");
		cliente2.setEmail("maria@email.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
