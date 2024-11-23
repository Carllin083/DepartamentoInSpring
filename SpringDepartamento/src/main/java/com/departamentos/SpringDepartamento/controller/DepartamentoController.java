package com.departamentos.SpringDepartamento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.departamentos.SpringDepartamento.entidade.Departamento;
import com.departamentos.SpringDepartamento.service.DepartamentoService;

@RequestMapping("/produtos")
@RestController
public class DepartamentoController {
	
	@Autowired
	DepartamentoService produtoService;
	
	@GetMapping
	private List<Departamento> listar(){
		return produtoService.listar();
	}
	
	@PostMapping
	public Departamento criarProduto(@RequestBody Departamento produto) {
		return produtoService.salvar(produto);
	}
}
