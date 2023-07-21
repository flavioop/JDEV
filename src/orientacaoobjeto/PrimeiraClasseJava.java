package orientacaoobjeto;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
				
		for(int qtd = 1; qtd <=2; qtd++) {

		/* Objeto na memória */

		/* New, instanciando objeto */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno" +qtd+"?" );
		/*String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Registro Geral?");
		String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da Matricula?");
		String serieMatricula = JOptionPane.showInputDialog("Qual a série matriculada?");*/
		String numeroDeMaterias = JOptionPane.showInputDialog("Quantas matérias vai cursar?");

		/*
		 * String disciplina1 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 1"); String nota1 =
		 * JOptionPane.showInputDialog("Qual a nota da " + disciplina1 + " de " + nome +
		 * "?"); String disciplina2 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 2"); String nota2 =
		 * JOptionPane.showInputDialog("Qual a nota da "+ disciplina2 + " de " + nome +
		 * "?"); String disciplina3 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 3"); String nota3 =
		 * JOptionPane.showInputDialog("Qual a nota da " + disciplina3 + " de " + nome +
		 * "?"); String disciplina4 =
		 * JOptionPane.showInputDialog("Qual o nome da disciplina 4"); String nota4 =
		 * JOptionPane.showInputDialog("Qual a nota da " + disciplina4 + " de " + nome +
		 * "?");
		 */

		Aluno aluno1 = new Aluno();/* Aqui será o João */
		/*aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setSerieMatriculado(serieMatricula);*/
		

		for(int pos = 1; pos <= (Integer.valueOf(numeroDeMaterias)); pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos +"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + "?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));		
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int  escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if(escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {
			
			String disciplinaRemover  = JOptionPane.showInputDialog("Qual a disciplina 1,2,3,4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continua a remover?");
			
			}
		}
		
		alunos.add(aluno1);
		
		for (int pos = 0; pos < alunos.size();pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("Alex")){
				Aluno trocar = new Aluno();
			
				
			}
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do Aluno = " +(aluno.getMediaNota()));
			System.out.println("Resultado  "  + aluno.getAlunoAprovado2());
			System.out.println("-----------------------------------------");
		
		for (int posd = 0; posd < aluno.getDisciplinas().size(); posd++) {
			
			Disciplina disc = aluno.getDisciplinas().get(posd);
			System.out.println("Matéria = " + disc.getDisciplina() + "Nota " + disc.getNota());
		}
			
		
		}
		
		
		
		
		}
		
		/*for (Aluno aluno : alunos) {
			if(aluno.getNome().equalsIgnoreCase("alex")){

			alunos.remove(aluno);
			break;
			
			}else {
			
			System.out.println("O nome é igual " + aluno.getNome());
			System.out.println("A idade do aluno é " + aluno.getIdade());
			System.out.println("A data de nascimento é " + aluno.getDataNascimento());
			System.out.println("O número do registro geral é " + aluno.getRegistroGeral());
			System.out.println("O número do CPF é " + aluno.getNumeroCpf());
			System.out.println("Médida da nota é = " + aluno.getMediaNota());			
			System.out.println("Resultado =  " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			JOptionPane.showMessageDialog(null, ("Resultado =  " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado")));
			System.out.println("------------------------------------------------------------------------------------------------");
			
			}
		}*/
		


		/*
		 * System.out.println(aluno1.toString()); System.out.println("Média do aluno " +
		 * aluno1.getMediaNota()); System.out.println("Resultado = " +
		 * aluno1.getAlunoAprovado2());
		 */

	}

}
