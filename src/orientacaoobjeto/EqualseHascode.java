package orientacaoobjeto;

public class EqualseHascode {
	
	public static void main(String[] args) {
		/*Equals e hascode (Diferenciar e comparar objetos)*/
		/*Reescrever metodo equals hascode, compara objetos e verifica se s�o iguais,
		 pois o equals vai olhar a posi��o na mem�ria, reescrevendo os m�todos, vc n�o 
		 compara isso e sim um campo especifico como o CPF*/
		
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fl�vio");
		aluno1.setNumeroCpf("123");
	
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Fl�vio");
		aluno1.setNumeroCpf("124");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		}else {
			System.out.println("Alunos diferentes");
		}
		
		
	}
	

}
