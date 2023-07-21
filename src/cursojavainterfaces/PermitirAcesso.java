package cursojavainterfaces;

/*(Contrato de autenticação, decidimos quais classes tem acesso)*/
public interface PermitirAcesso {
	
	/*public boolean autenticar();/*Apenas declaração do Método */
	public boolean autenticar(String login, String Senha);
	
	public boolean autenticar();

}
