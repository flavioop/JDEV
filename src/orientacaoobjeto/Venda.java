package orientacaoobjeto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private Long id;
	private String descricaoVenda;
	private String nomeCliente;
	private String enderecoEntrega;
	private BigDecimal valorTotal;
	
	private List<Produto> listaProdutos = new ArrayList<Produto>();
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public void addProduto (Produto produto) {
		
		if(produto.getId().equals(3)) {
			
			System.out.println("Com a inserção de valores na lista por método, pode se fazer validações");						
		}else {
			
			System.out.println("Acho que vou começar a usar assim");
		}			
		
		this.listaProdutos.add(produto);
	}

	private double totalVenda() {
		double total = 0.0;
		for (Produto produto : listaProdutos) {
			total += produto.getValor().doubleValue();			
		}
		return total;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricaoVenda() {
		return descricaoVenda;
	}
	public void setDescricaoVenda(String descricaoVenda) {
		this.descricaoVenda = descricaoVenda;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	public BigDecimal getValorTotal() {
		this.valorTotal = BigDecimal.valueOf(totalVenda());
		return valorTotal;
	}
	
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	@Override
	public String toString() {
		return "Venda [id=" + id + ", descricaoVenda=" + descricaoVenda + ", nomeCliente=" + nomeCliente
				+ ", enderecoEntrega=" + enderecoEntrega + ", valorTotal=" + valorTotal + ", listaProdutos="
				+ listaProdutos + "]";
	}
	
	
	
	

}
