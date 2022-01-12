package br.com.academy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.academy.Enums.Curso;
import br.com.academy.Enums.Status;

@Entity
public class Aluno {
	
//	@Column(name="")--> o hybernate esta criando as colunas automaticamente no banco quando digitamos isso
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="curso")
	@Enumerated(EnumType.STRING)
	private Curso curso;
	
	@Column(name="matricula")
	private String matricula;
	
	@Column(name="status")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name="turno")
	private String turno;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	

//Getters e Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
