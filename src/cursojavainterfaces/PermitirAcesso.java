package cursojavainterfaces;

/*(Contrato de autentica��o, decidimos quais classes tem acesso)*/
public interface PermitirAcesso {
	
	/*public boolean autenticar();/*Apenas declara��o do M�todo */
	public boolean autenticar(String login, String Senha);
	
	public boolean autenticar();

}
