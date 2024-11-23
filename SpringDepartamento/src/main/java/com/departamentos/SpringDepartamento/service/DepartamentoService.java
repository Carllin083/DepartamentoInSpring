package com.departamentos.SpringDepartamento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.departamentos.SpringDepartamento.entidade.Departamento;
import com.departamentos.SpringDepartamento.repositorio.DepartamentoRepositorio;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepositorio produtoRepositorio;
	
	public List<Departamento> listar(){
		return produtoRepositorio.findAll();
	}
	
	public Departamento salvar(Departamento departamento) {
		return produtoRepositorio.save(departamento);
	}
	
}
