package executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import classesauxiliares.FuncaoAuntenticacao;
import constantes.StatusAluno;
import cursojavainterfaces.PermitirAcesso;
import revisaoOrientacaoObjetos.Aluno;
import revisaoOrientacaoObjetos.Disciplina;
import revisaoOrientacaoObjetos.Secretario;

public class PrimeiraClasse {
	
	public static void main(String[] args) {
		
		try {
			
		
		
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
			

		
		if(new FuncaoAuntenticacao(new Secretario(login, senha)).autenticar()){/*Travar o contrato para autorizar quem realmente tem o contrato100% Legitimo*/
		
		/*if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {*/
			
				
		/*Descrição do objeto na memória*/
	
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		/*HashMap é uma lista que identifica uam sequencia de valores*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		/*List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();*/

		
		for(int qtd = 1; qtd <=5;qtd++) {
		
				
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno"+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimeto = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual o RG?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf?");
		String nomeMae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String nomePai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual a série da matricula?");*/
		
		Aluno aluno = new Aluno();
		
		aluno.setNome(nome);
		/*aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimeto);
		aluno.setRegistroGeral(registroGeral);
		aluno.setCpf(cpf);
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setDataMatricula(dataMatricula);
		aluno.setSerieMatriculado(serieMatriculado);*/
		
		for(int pos = 1; pos <= 1; pos++) {
		
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+"?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno.getDisciplinas().add(disciplina);
						
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			
		if (escolha == 0) {
			
			int continuarRemover = 0;
			int posicao = -1;
			while(continuarRemover == 0){
				
				String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3,4 ?");
				aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()- posicao);
				posicao ++;
				continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover?");
			}
			
		}
		
		/*Disciplina disciplina1 = new Disciplina();
		
		aluno.getDisciplinas().add(disciplina1);
		disciplina1.setDisciplina("Banco de dados");
		disciplina1.setNota(90);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(80);
		aluno.getDisciplinas().add(disciplina2);
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(97);
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina2.setNota(70);
		aluno.getDisciplinas().add(disciplina4);*/

		alunos.add(aluno);		
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			
			if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)){
				maps.get(StatusAluno.APROVADO).add(aluno);
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}else{
					maps.get(StatusAluno.REPROVADO).add(aluno);				
			}
			
		}
		
		System.out.println("--------------------Lista dos Aprovados--------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = Nome "+ aluno.getNome() +" " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista dos Recuperação--------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Resultado = Nome " + aluno.getNome() +" "  + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		System.out.println("--------------------Lista dos Reprovados--------------------------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado =  Nome " + aluno.getNome() +" " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		
		/*for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			if(aluno.getNome().equalsIgnoreCase("alex")){
				
				Aluno trocar = new Aluno ();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("Matematica");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				alunos.set(pos,trocar);
				aluno = alunos.get(pos);
							
			
			
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Média do aluno = " + aluno.getMediaNota());
			System.out.println("Resultado = " + aluno.getAlunoAprovado2());

			
			for (int posd = 0; posd < aluno.getDisciplinas().size(); posd ++) {
				
				Disciplina disc = aluno.getDisciplinas().get(posd);
				System.out.println("Materia "+disc.getDisciplina() + " Nota = " + disc.getNota());
								
			}
			System.out.println("-------------------------------------------------------");
		}
		
		*/
		
	/*	for(Aluno aluno : alunos) {
			
		if(aluno.getNome().equalsIgnoreCase("Alex")) {	
			
			alunos.remove(aluno);
			}else {
				System.out.println(aluno.toString());
				System.out.println("Média do aluno = "+ aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("-------------------------------------------------------------------------");
				break;
		}	
	}
		
		for(Aluno aluno : alunos) {
			System.out.println("Alunos que sobraram na lista?");
			System.out.println(aluno.getNome());
			System.out.println("Suas materias são");
			System.out.println(aluno.getDisciplinas());
			
			for(Disciplina disciplina : aluno.getDisciplinas()) {
				System.out.println(disciplina.getDisciplina());
			}
		}
		*/
		
		/*System.out.println("O nome do aluno é " +  aluno.getNome());
		System.out.println("A idade do aluno é " + aluno.getIdade());
		System.out.println("A data de nascimento do aluno é " + aluno.getDataNascimento());
		System.out.println("O registro gerak é " + aluno.getRegistroGeral());
		System.out.println("O nome da mãe do aluno é" + aluno.getNomeMae());
		System.out.println("O nome do pai do aluno é " + aluno.getNomePai());
		System.out.println("A data da matricula é " + aluno.getDataMatricula());
		System.out.println("Qual a primeira nota" + aluno.getNota1());
		System.out.println("Qual a segunda nota" + aluno.getNota2());
		System.out.println("Qual a terceira nota" + aluno.getNota3());
		System.out.println("Qual a quarta nota" + aluno.getNota4());
		System.out.println("Média da nota é " + aluno.getMediaNota());
		System.out.println("Resultado = " + (aluno.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno.getAlunoAprovado2());
		
		/*===========================================================================================
		
		System.out.println("===========================================================================");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Maria");
		aluno1.setIdade(35);
		aluno1.setDataNascimento("21/08/1985");
		aluno1.setRegistroGeral("333.232.31.4");
		aluno1.setNumeroCpf("233.5852.2121.21");
		aluno1.setNomeMae("Angela");
		aluno1.setNomePai("Francisco");
		aluno1.setDataMatricula("01/11/2005");
		aluno1.setSerieMatriculado("7");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		System.out.println("O nome do aluno é " +  aluno1.getNome());
		System.out.println("A idade do aluno é " + aluno1.getIdade());
		System.out.println("A data de nascimento do aluno é " + aluno1.getDataNascimento());
		System.out.println("O registro gerak é " + aluno1.getRegistroGeral());
		System.out.println("O nome da mãe do aluno é" + aluno1.getNomeMae());
		System.out.println("O nome do pai do aluno é " + aluno1.getNomePai());
		System.out.println("A data da matricula é " + aluno1.getDataMatricula());
		System.out.println("A série que está matriculado é " + aluno1.getSerieMatriculado());
		System.out.println("Média da nota é " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado()? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		*/
		
		/*Equals e hashcode(Diferenciar e comparar objetos)*/
		/*Aluno aluno1 = new Aluno();
		aluno1.setNome("Alex");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Alex");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else{
			System.out.println("Alunos não são iguais");
		}
		*/
		
		}else {
			
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
			
		}
	}catch (Exception e) {
		
		StringBuilder saida = new StringBuilder();
		
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Erro ao processar notas" + e.getMessage());
		
		for(int i = 0; i < e.getStackTrace().length; i++){
			
			saida.append("\n Clase de erro :" + e.getStackTrace()[i].getClassName());
			saida.append("\n Metodo de erro :" + e.getStackTrace()[i].getMethodName());
			saida.append("\n Linha de erro :" + e.getStackTrace()[i].getLineNumber());
			saida.append("\n Class :" + e.getStackTrace()[i].getClass().getName());
		}
	}
  }
}

