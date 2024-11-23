package com.departamentos.SpringDepartamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = "com.departamentos.SpringDepartamento.entidade")
@EnableJpaRepositories(basePackages = "com.departamentos.SpringDepartamento.repositorio")//identifico meu repositorio
@SpringBootApplication
public class SpringDepartamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDepartamentoApplication.class, args);
	}

}
