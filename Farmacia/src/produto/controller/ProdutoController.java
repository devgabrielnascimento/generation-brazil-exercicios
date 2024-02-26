package produto.controller;

import java.util.ArrayList;

import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int id = 0;
	public void criarProduto(Produto produto) {
		listaProdutos.add(produto);
		
		System.out.println("O produto de ID: " + produto.getId() + " foi criado com sucesso!");
	};
	 @Override
	public void listarTodosProdutos() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
	};
	 @Override
	public void consultarPorID(int id) {
			
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			System.out.println("As informações atuais desse produto são: ");
			produto.visualizar();
		}
		else if (produto == null)  { 
			System.out.println("\nO produto ID: " + id + " não foi encontrado!");
		}
		
	 }
	;
	 @Override
	public void atualizarProduto(Produto produto) {
		
		var produtoAtualizar = buscarNaCollection(produto.getId());
		
		if (produtoAtualizar != null) {
			listaProdutos.set(listaProdutos.indexOf(produtoAtualizar), produto);
			System.out.println("\nO produto ID: " + produto.getId() + " foi atualizado com sucesso!");
		} else 
			System.out.println("\nO produto ID: " + produto.getId() + " não foi encontrado!");
		
	};
	 @Override
	public void deletarProduto(int id) {
		var produto = buscarNaCollection(id);
		
		if (produto != null) {
			if (listaProdutos.remove(produto) == true)
				System.out.println("\nO produto ID: " + id + " foi deletado com sucesso!");
		} else
			System.out.println("\nO produto ID: " + id + " não foi encontrado!!");
				
	};

	
	public int gerarId() {
		
		return ++ id;
	}
	
	public Produto buscarNaCollection(int id) {
		
		for(var produto: listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}
}
