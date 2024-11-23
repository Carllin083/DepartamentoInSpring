package com.departamentos.SpringDepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departamentos.SpringDepartamento.entidade.CursoEntidade;

@Repository
public interface CursoRepositorio extends JpaRepository<CursoEntidade, Long> {

}
