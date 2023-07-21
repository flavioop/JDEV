package OperacoesLogicas;

public class EstruturadeRepeticaoeContinue {
	public static void main(String[] args) {
		
		for (int numero = 0; numero < 10; numero++) {
			
			if(numero == 3) {
				System.out.println("Oba encontrei o número 3");
				continue;
			}
			
			System.out.println(numero);
			
		}
		
	}

}
