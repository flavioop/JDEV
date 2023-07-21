package executavel;

import revisaoOrientacaoObjetos.Aluno;
import revisaoOrientacaoObjetos.Diretor;
import revisaoOrientacaoObjetos.Pessoa;
import revisaoOrientacaoObjetos.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Alex JDev Treinamento");
		aluno.setNomeEscola("JDev Treinamento");
		aluno.setIdade(22);
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("45ssad45f45sd22asfads");
		diretor.setNome("Egidio");
		diretor.setIdade(50);
		
		Secretario secretario = new Secretario();
		secretario.setExperiencia("Administração");
		secretario.setIdade(18);
		secretario.setNome("João");
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println (aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println (diretor.pessoaMaiorIdade());
		System.out.println (secretario.pessoaMaiorIdade());
		
		System.out.println("Salário do aluno é = " + aluno.salario());
		System.out.println("Salário do diretor é = " + diretor.salario());
		System.out.println("Salário do secretario é = " + secretario.salario());
				
		teste(aluno);
		teste(diretor);
		teste(secretario);
		
	}
					
	public static void teste(Pessoa pessoa){
		System.out.println("Essa pessoa é demais = " + pessoa.getNome() +  " o salário é de = " + pessoa.salario());
		
	}

}
