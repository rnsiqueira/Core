package ILearn;

public class Aula {

	private String aula;
	private int alunos;
	
	



	public Aula(String aula, int alunos) {

		this.aula = aula;
		this.alunos = alunos;
		
	}

	public String getAula() {
		return aula;
	}

	public int getAlunos() {
		return alunos;
	}
	
	public void adiciona(Aula a) {
		this.aula = a.aula;
		this.alunos = a.alunos;
		
	}

}
