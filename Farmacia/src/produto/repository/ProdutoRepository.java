package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
	public void criarProduto(Produto produto);
	public void listarTodosProdutos();
	public void consultarPorID(int id);
	public void atualizarProduto(Produto produto);
	public void deletarProduto(int id);
	
}
