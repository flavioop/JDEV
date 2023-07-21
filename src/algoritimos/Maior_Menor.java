package algoritimos;

import java.util.Scanner;

public class Maior_Menor {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		 Scanner entrada = new Scanner(System.in);
		
		 System.out.println("Informe primeiro número:");
		 a = entrada.nextInt();
		 
		 System.out.println("Informe segundo número:");
		 b = entrada.nextInt();
		 
		 System.out.println("Informe terceiro número:");
		 c = entrada.nextInt();
		
			
			if(a == b || a == c || b == c) {
			
				System.out.println("O sistema n�o trabalha com numeros iquais");
			
			}
				
				
				if(a > b && c < b) {
					System.out.println("O maior é o A: " + a);
					System.out.println("O menor é o C: " + c);
				}else if ( b > a && c < a) {
					System.out.println("O maior é o B: " + b);
					System.out.println("O menor é o C: " + c);
								
				}else if (b > a && b > c && a < c){
					System.out.println("O maior é o B: " + b);
					System.out.println("O menor é o A: " + a);
															
				}else if(c > b && a < b){
					System.out.println("O maior é o C: " + c);
					System.out.println("O menor é o A: " + a);
				
				}else if(c > a && b < a){
					System.out.println("O maior é o C: " + c);
					System.out.println("O menor é o B: " + b);
				}
			
		}
		
	
	
}
