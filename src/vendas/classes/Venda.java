package vendas.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

	private Date data;
	private List<ItemVenda> produtosASairem = new ArrayList<ItemVenda>();
	
	/*
	 * For responsável pela leitura da List, afim de calcular o valor total 
	 * da compra efetuada.
	 */
	public float valorTotal() {
		float valorTotal = 0;
		
		for (ItemVenda item : produtosASairem) {
			valorTotal += item.subtotal();
		}
		
		return valorTotal;
	}
	
	public void addItemVenda(ItemVenda item) {
		produtosASairem.add(item);
	}
	
	/* 
	 * For responsável por buscar os itens da lista a serem exibidos na
	 * finalização da compra.
	 */
	public String finalizacaoDeVenda() {
				
		for (ItemVenda item : produtosASairem) {
			System.out.println(
					  item.getProduto().getNome() + " -- "
					+ item.getProduto().getDescricao() + " - " 
					+ "Quantidade: " + item.getQuantidade() + " -- " 
					+ "Valor Unico: " + item.getProduto().getPreco() + " -- "
					+ "Valor Total do Item: " 
					+ item.getQuantidade() * item.getProduto().getPreco()
			);
		}
		
		System.out.println("Total= "  + this.valorTotal()
		+ "\n" + data
		);
		
		return ".............................................................................................";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
}
