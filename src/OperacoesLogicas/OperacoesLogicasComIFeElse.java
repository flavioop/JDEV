package OperacoesLogicas;

public class OperacoesLogicasComIFeElse {

	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Fl�vio1";

		if (mediaAluno >= 70 && nome.equals("Fl�vio")) {

			System.out.println("Parab�ns voc� est� aprovado!");

		} else if (mediaAluno < 70) {

			System.out.println("Voc� foi reprovado!");

		} else {

			System.out.println("Aluno n�o encontrado!");

		}

	}

}
