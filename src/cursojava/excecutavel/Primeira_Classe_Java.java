package cursojava.excecutavel;

public class Primeira_Classe_Java {
	
	
	//Variavel global pe acessivel a todos e seu valor � compartilhado 
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {
		
		boolean logica;
		boolean logica2;
		int numero;
		int numero2;
		short numero4;
		int maiorIdade = 18;
		int idosoIdade = 60;
		int jovemIdade = 16;
		int criancaIdade = 7; 
		
		System.out.println("Meu primeiro programa java do curso Forma��o Java Web");
		System.out.println("Teste 2");
		System.out.println("Maior idade � = " + maiorIdade );
		
		System.out.println();
		System.out.println();
		System.out.println("Valor variavel local " + maiorIdade);
		
		metodo2 ();	
		
			}
	
	private static void metodo2 () {
		//Variavel local s� pode ser usada dentro do m�todo.
		System.out.println("O valor da variavel Global � " +maiorIdadeGlobal);
		// TODO Auto-generated method stub

	}
	

}
