package OperacoesLogicas;

public class OperacoesLogicasAlinhadas {
	
	public static void main(String[] args) {
		
	
		int media = 0;
		
		//media = (nota1 + nota2 + nota3 + nota4) /4;
		
		media = 50;
		
		if(media >= 50){
			if (media >= 70 ) {
				if(media > 90) {
					System.out.println("Aluno aprovado direto - Parabéns " + "Nota: " + media);
				}else {
					System.out.println("Aluno aprovado direto " + "Nota: "  + media);
				}	
			}else {
					System.out.println("Aluno em recuperação " + "Nota: "  + media);
			}
		 }else {
				System.out.println("Aluno reprovado direto " + "Nota: "  + media);
		}
	}
  
}
