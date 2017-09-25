package ILearn;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private Set<Aluno> alunos = new HashSet<>();
	private Set<Aula> aulas = new HashSet<>();

	public Curso(String nome, String instrutor) {
		super();
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}
	
	
	public void adiciona(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void adicionaAula(Aula a) {
		this.aulas.add(a);
	}
	
	
	//Lista de objetos imutavel
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {
		
		return alunos.contains(aluno);
		
	}
	

	
	

}
