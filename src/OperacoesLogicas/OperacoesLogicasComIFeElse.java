package OperacoesLogicas;

public class OperacoesLogicasComIFeElse {

	public static void main(String[] args) {

		int mediaAluno = 70;
		String nome = "Flávio1";

		if (mediaAluno >= 70 && nome.equals("Flávio")) {

			System.out.println("Parabéns você está aprovado!");

		} else if (mediaAluno < 70) {

			System.out.println("Você foi reprovado!");

		} else {

			System.out.println("Aluno não encontrado!");

		}

	}

}
