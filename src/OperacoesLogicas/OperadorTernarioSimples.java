package OperacoesLogicas;

public class OperadorTernarioSimples {
	
	public static void main(String[] args) {
		
		/*Operadores Tern�rios s�o para micro valida��es em uma linha s�*/
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 88;
		int media = 0;
		
		
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
	
		
			
		String saidaResultado;
	
		saidaResultado = media >70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em recupera��o" : "Aluno Reprovado";
		
		System.out.println(saidaResultado);
		
	}
	

}
