package executavel;

import revisaoOrientacaoObjetos.Aluno;
import revisaoOrientacaoObjetos.Disciplina;


public class ArrayVetor {

	public static void main(String[] args) {
		
		double[] notas = {8.8,9.7,6.6,7.8};
		double[] notasLogica = {9.8,6.7,8.6,7.8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDev Treinamentos");
		
			
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de programação");
		disciplina2.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno();
		aluno.setNome("Flávio Pedro");
		aluno.setNomeEscola("Java");
		
			
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso de Java1");
		disciplina3.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Lógica de programação");
		disciplina4.setNota(notasLogica);
		
		aluno.getDisciplinas().add(disciplina);
		
		
		
		Aluno [] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		for (int pos =0; pos < arrayAlunos.length; pos++){
			
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for(Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Nome da disciplina é: " + d.getDisciplina());
				
				for(int posnota = 0; posnota < d.getNota().length; posnota++) {
				System.out.println("A nota número :" + posnota + "é igual = " + d.getNota()[posnota]);	
					
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Nome do Aluno é igual: " + aluno.getNome());
		System.out.println("Inscrito na Escola: " + aluno.getNomeEscola());
		
		System.out.println("--------Disciplinas do aluno--------" );
		
		for(Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas das são: ");
			
			double notaMin = 0.0;
			double notaMax = 0.0;
			for(int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual =" + d.getNota()[pos]);
				
				if(pos == 0) {
					notaMax = d.getNota()[pos];
					notaMin = d.getNota()[pos];
					}else {				
						if(d.getNota()[pos] > notaMax) {
							notaMax = d.getNota()[pos];			
						if(d.getNota()[pos] < notaMax) {
							notaMin = d.getNota()[pos];
						}		
				}						
			}				
		}
			
				System.out.println("A maior nota da Disciplina " +d.getDisciplina() + "e de valor : " + notaMax);
				System.out.println("A menor nota da Disciplina " +d.getDisciplina() + "e de valor : " + notaMin);
		}
		
		
		
		
		
		
		
		
		
		
		
		/*String posicoes = JOptionPane.showInputDialog("Quantas posições o Array deve ter?");
		
		
		
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		
		
		for(int i = 0; i <notas.length; i++) {	
				String valor = JOptionPane.showInputDialog("Qual o valor da posição = " + i);
				notas[i] = Double.valueOf(valor);
				
		}
		
		for (int i = 0 ; i < notas.length; i++) {
						
			System.out.println("Notas " + (i + 1) + " é = " + notas[i]);
			
		}*/
		

	}

}
