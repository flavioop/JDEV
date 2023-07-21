package classesauxiliares;

import cursojavainterfaces.PermitirAcesso;

/*Realmente e somente receber quem tem o contrato da interface e permitir o acesso e chamar o autenticar*/
public class FuncaoAuntenticacao {
	
	private PermitirAcesso permitirAcessso;
	
	public boolean autenticar() {
		return permitirAcessso.autenticar();
	}
	
	public FuncaoAuntenticacao(PermitirAcesso acesso){
		this.permitirAcessso = acesso;
		
	}
	

}
