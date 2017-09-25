package Test;

import java.util.Iterator;
import java.util.Set;

import ILearn.Aluno;
import ILearn.Aula;
import ILearn.Curso;

public class testaCursoComAluno {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adicionaAula(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adicionaAula(new Aula("Criando uma Aula", 20));
		javaColecoes.adicionaAula(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		
		javaColecoes.adiciona(a1);
		javaColecoes.adiciona(a2);
		javaColecoes.adiciona(a3);
		
		System.out.println("Todos Alunos Matriculados");
		
		javaColecoes.getAlunos().forEach(Alusno -> System.out.println(Alusno));
		
		Aluno newAluno =  new Aluno("Guilherme Silveira", 5617);
		
		System.out.println(javaColecoes.estaMatriculado(a2));
		
		
		
		System.out.println(a2.equals(newAluno));
	
		
		//Modo antigo
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
		
	}
}
