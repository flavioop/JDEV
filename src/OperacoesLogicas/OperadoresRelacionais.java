package OperacoesLogicas;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		/*Igual*/
		if(nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}else {
			System.out.println("As notas s�o diferentes");
		}
		/*Diferente*/
		if(nota1 != nota2) {
			System.out.println("As notas s�o diferentes");
		}else {
			System.out.println("As notas s�o iguais");
		}

		/*Maior e Menor*/
		if(nota1 > nota2) {
			System.out.println("As notas s�o diferentes");
		}else {
			System.out.println("As notas s�o iguais");
		}		
		
	}

}
