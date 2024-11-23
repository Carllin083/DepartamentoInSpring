package com.departamentos.SpringDepartamento.entidade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Departamento {

	@Id //chave primaria
	@GeneratedValue(strategy = GenerationType.SEQUENCE) //gerado automaticamente
	private Long codigo;

	private String nome;
	
    @ManyToOne
    @JoinColumn(name = "chefe_id")
    private ProfessorEntidade chefe;
	

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



}
