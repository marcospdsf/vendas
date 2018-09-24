package vendas.classes;

public class Produto {

	private String nome;
	private String descricao;
	private float preco;
	
	public Produto(String nome, String descricao, float preco) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public String getNome() {
		return nome;
	}
	
}
