package revisaoOrientacaoObjetos;

/* Herança - Classe pai... MAster... Super classe*/
public abstract class Pessoa {

	protected int idade;
	protected String nome;
	protected String dataNascimento;
	protected String registroGeral;
	protected String cpf;
	protected String nomeMae;
	protected String nomePai;
	
	/*metodo abstrado são obrigatórios*/
	public abstract double salario();
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	
	/*Retorna true se for maio de 18*/
	public boolean pessoaMaiorIdade() {
		return idade >= 18; 
	}
	
	
}
