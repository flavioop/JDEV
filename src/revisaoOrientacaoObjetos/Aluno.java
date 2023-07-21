package revisaoOrientacaoObjetos;

import java.util.ArrayList;
import java.util.List;

import constantes.StatusAluno;

public class Aluno extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>() ;
	
			
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}


	/*Set recebe os dados*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	/*Método que retorna a média*/
	
	
	
	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
			
			somaNotas += disciplina.getMediaNotas();
			
		}
		
		return somaNotas / disciplinas.size();
	}
	
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if (media >= 70) {
			return true;
		}else {	
			return false;
		}
		
	}
	
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if (media >= 50) {
			if(media >=70) {
			    return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {	
			return StatusAluno.REPROVADO;
		}
	}
	
	@Override/*Identifica metodo sobescrito, já existe na classe pai, vamos reescrever*/
	public boolean pessoaMaiorIdade() {
			
		return idade > 21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Obaa aluno é maio de idade" : "Ixii você é menor de idade";
		
	}
	
	public double salario() {
		return 1500.90;
	}
	
	
	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}




	/*@Override
	public String toString() {
		return "Aluno [idade=" + getIdade() + ", nome=" + getNome() + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nota4=" + nota4
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		return true;
	}
*/
	
	

}
