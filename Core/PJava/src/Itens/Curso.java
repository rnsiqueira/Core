package Itens;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private int tempoTotal = 0;

	public Curso(String nome, String instrutor) {

		this.nome = nome;
		this.instrutor = instrutor;
	}

	public Curso() {

	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public void adiciona(Aula aula) {
		aulas.add(aula);

	}

	public int getTempoTotal() {
		for (Aula aula : aulas) {
			this.tempoTotal += aula.getTempo();

		}
		return this.tempoTotal;

	}
	
	@Override
	public String toString() {
		return "Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
        + ", aulas: + " + this.aulas + " ";
	}

}
