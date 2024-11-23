package com.departamentos.SpringDepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departamentos.SpringDepartamento.entidade.AlunoEntidade;

@Repository
public interface AlunoRepositorio extends JpaRepository<AlunoEntidade, Long>{

}
