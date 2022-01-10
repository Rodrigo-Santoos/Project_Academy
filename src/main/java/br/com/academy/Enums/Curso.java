package br.com.academy.Enums;

public enum Curso {
	
	ADMINISTRACAO("Administracao"),
	INFORMATICA("Informatica"),
	CONTABILIDADE("Contabilodade"),
	PROGRAMACAO("Programacao"),
	Odontologia("Odontologia"),
	ENFERMAGEM("Enfermagem");
	
	private String curso;
	
	private Curso(String curso) {
		this.curso= curso;
	}
	

}
