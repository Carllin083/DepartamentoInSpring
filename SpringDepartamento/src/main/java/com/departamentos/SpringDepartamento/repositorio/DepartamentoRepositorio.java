package com.departamentos.SpringDepartamento.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.departamentos.SpringDepartamento.entidade.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long>{

}
