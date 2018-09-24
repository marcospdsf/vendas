package vendas.classes;

import java.util.List;

public interface CatalogoProdutos {
	
	List<Produto> listarProdutos(float precoMin, float precoMax);
	List<Produto> listarProdutos(String nome);

}
