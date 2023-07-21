package revisaoOrientacaoObjetos;

/*Classe filha pessoa - Extende Pessoa*/
public class Diretor extends Pessoa{
	
	private String registroEducacional;
	private int tempoDirecao;
	private String titulacao;
	public String getRegistroEducacional() {
		return registroEducacional;
	}
	public void setRegistroEducacional(String registroEducacional) {
		this.registroEducacional = registroEducacional;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public double salario() {
		return 3900.78;
	}
	
	
	@Override
	public String toString() {
		return "Diretor [registroEducacional=" + registroEducacional + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", idade=" + idade + ", nome=" + nome + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", cpf=" + cpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ "]";
	}
	
	
	
	
	

}
