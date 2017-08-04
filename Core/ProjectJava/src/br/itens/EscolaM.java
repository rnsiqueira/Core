package br.itens;



public class EscolaM {
	AlunoM[]  vetA;
	
	void imprimeAlunoM() {
		for(int i = 0; i <= this.vetA.length; i++ ) {
			AlunoM vetA = this.vetA[i];
			if(vetA == null)continue;
			System.out.println(vetA.Idade);
			System.out.println(vetA.Nome);
			System.out.println(vetA.Instrumentos);
			System.out.println(vetA.Turma);
			
		}
	}
	
	void addAlunoM(AlunoM al) {
		for(int i = 0; i <= vetA.length; i++ ) {
			EscolaM es = new EscolaM();
			es.vetA = new AlunoM[i];
			es.vetA[i] = new AlunoM();
			es.imprimeAlunoM();
		
		}
	
	}
	
	public static void main(String[] args) {
		EscolaM es = new EscolaM();
		es.vetA = new AlunoM[3];
		es.vetA[0] = new AlunoM();
		es.vetA[0].Idade = 17;
		es.addAlunoM(es.vetA[0]);
	}
	
}
