package com.departamentos.SpringDepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.departamentos.SpringDepartamento.entidade.ProfessorEntidade;

@Repository
public interface ProfessorRepositorio extends JpaRepository<ProfessorEntidade, Long> {

}
