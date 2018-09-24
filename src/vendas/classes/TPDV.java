package vendas.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TPDV implements CatalogoProdutos {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	private List<Venda> vendas = new ArrayList<Venda>();
	
	@Override
	public List<Produto> listarProdutos(float precoMin, float precoMax) {
		return null;
	}

	@Override
	public List<Produto> listarProdutos(String nome) {
		return null;
	}
	
	public void iniciarVenda() {
		
		Venda venda = new Venda();
		venda.setData(new Date(System.currentTimeMillis()));
		
		Produto produto1 = new Produto("Nescau", "Ceral Matinal", 4.9F);
		ItemVenda item1 = new ItemVenda(2, produto1);
		venda.addItemVenda(item1);
		
		Produto produto2 = new Produto("Farinha", "Feita de Mandioca", 2.2F);
		ItemVenda item2 = new ItemVenda(3, produto2);
		venda.addItemVenda(item2);
		
		System.out.println(venda.finalizacaoDeVenda());
		
		this.vendas.add(venda);
		
	}

	public void mostrarVendas() {
		for (Venda venda : vendas) {
			System.out.println(venda.getData());
		}
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

}
