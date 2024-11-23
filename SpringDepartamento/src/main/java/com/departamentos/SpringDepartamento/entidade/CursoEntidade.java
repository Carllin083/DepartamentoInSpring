package com.departamentos.SpringDepartamento.entidade;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class CursoEntidade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@ManyToMany
	@JoinTable(name = "curso_professor", joinColumns = @JoinColumn(name = "curso_id"), inverseJoinColumns = @JoinColumn(name = "professor_id"))
	private Set<ProfessorEntidade> professores = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "aluno_curso", joinColumns = @JoinColumn(name = "curso_id"), inverseJoinColumns = @JoinColumn(name = "aluno_id"))
	private Set<AlunoEntidade> alunos = new HashSet<>();
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<ProfessorEntidade> getProfessores() {
		return professores;
	}

	public void setProfessores(Set<ProfessorEntidade> professores) {
		this.professores = professores;
	}

	public Set<AlunoEntidade> getAlunos() {
		return alunos;
	}

	public void setAlunos(Set<AlunoEntidade> alunos) {
		this.alunos = alunos;
	}
}
