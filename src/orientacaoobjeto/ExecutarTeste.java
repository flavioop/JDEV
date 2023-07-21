package orientacaoobjeto;

import java.math.BigDecimal;

public class ExecutarTeste {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto();
		produto1.setId(1L);
		produto1.setNome("M�dulo Orienta��o Objeto");
		produto1.setValor(BigDecimal.valueOf(100));
		
		Produto produto2 = new Produto();
		produto2.setId(2L);
		produto2.setNome("M�dulo de Spring Boot API REST");
		produto2.setValor(BigDecimal.valueOf(300));
		
		Produto produto3 = new Produto();
		produto3.setId(3L);
		produto3.setNome("Angular 8");
		produto3.setValor(BigDecimal.valueOf(400));
		
		Produto produto4 = new Produto();
		produto4.setId(3L);
		produto4.setNome("M�dulo de Hibernate");
		produto4.setValor(BigDecimal.valueOf(250));
		
		
		Venda venda = new Venda();
		venda.setDescricaoVenda("Venda Curso Forma��o Java");
		venda.setEnderecoEntrega("Entrega pelo E-mail");
		venda.setId(10L);
		venda.setNomeCliente("Alex Fernando");
		venda.setValorTotal(BigDecimal.valueOf(197.00));
		
		venda.getListaProdutos().add(produto1);
		venda.getListaProdutos().add(produto2);
		venda.addProduto(produto3);
		venda.addProduto(produto4);
		
		System.out.println("Valor da variavel total " +  venda.getValorTotal());
		
		
		/*System.out.println("Descri��o venda : " + venda.getDescricaoVenda());*/
		/*System.out.println("Endere�o venda : " + venda.getDescricaoVenda());*/
			
		
	}

}
