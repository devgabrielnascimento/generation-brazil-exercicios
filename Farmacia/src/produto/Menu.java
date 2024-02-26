package produto;

import java.util.Scanner;

import produto.controller.ProdutoController;
import produto.model.Cosmetico;
import produto.model.Medicamento;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int id, tipo, digito;
		String nome, generico, fragancia;
		float preco;

		ProdutoController produtos = new ProdutoController();

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                                                      ");
			System.out.println("                                                      ");
			System.out.println(" FARMATI - 💊 A FARMÁRCIA QUE SE PREOCUPA COM VOCÊ! 💊");
			System.out.println("                                                      ");
			System.out.println("                                                      ");
			System.out.println("****************************************************");
			System.out.println("                                                      ");
			System.out.println("                    O que você deseja?              ");
			System.out.println("                                                      ");
			System.out.println("         [1] -     Cadastrar um produto             ");
			System.out.println("         [2] -     Atualizar um produto             ");
			System.out.println("         [3] -       Deletar um produto             ");
			System.out.println("         [4] -     Buscar por um produto            ");
			System.out.println("         [5] -    Listar todos os produtos          ");
			System.out.println("         [6] -        Sair do programa!             ");
			System.out.println("****************************************************");

			System.out.println("Digite uma opção: ");

			digito = sc.nextInt();
			switch (digito) {

			case 1:
				sc.nextLine();
				System.out.println("Vamos cadastrar um novo produto!");
				System.out.println("Digite o nome desse produto: ");
				nome = sc.nextLine();
				System.out.println("Digite o valor: ");
				preco = sc.nextFloat();
				do {
					System.out.println("Digite o tipo [1] Medicamento ou [2] Cosmético): ");
					tipo = sc.nextInt();
					sc.nextLine();
				} while (tipo < 1 && tipo > 2);

				if (tipo == 1) {
					System.out.println("Genérico: ");
					generico = sc.nextLine();
					produtos.criarProduto(new Medicamento(produtos.gerarId(), nome, tipo, preco, generico));
				} else if (tipo == 2) {
					System.out.println("Fragância: ");
					fragancia = sc.nextLine();
					produtos.criarProduto(new Cosmetico(produtos.gerarId(), nome, tipo, preco, fragancia));
				}

				break;

			case 2:

				System.out.println("Vamos atualizar um produto!");

				System.out.println("Informe o ID do produto que você deseja atualizar: ");

				id = sc.nextInt();
				sc.nextLine();
				var buscarProduto = produtos.buscarNaCollection(id);

				produtos.consultarPorID(id);

				tipo = buscarProduto.getTipo();

				switch (tipo) {

				case 1:

					System.out.println("Digite o nome do medicamento: ");

					nome = sc.nextLine();

					System.out.println("Digite o valor do medicamento: ");

					preco = sc.nextInt();
					sc.nextLine();
					System.out.println("Genérico: ");

					generico = sc.nextLine();
					produtos.atualizarProduto(new Medicamento(id, nome, tipo, preco, generico));

					break;

				case 2:

					System.out.println("Digite o nome do cosmético: ");

					nome = sc.nextLine();

					System.out.println("Digite o valor do cosmético: ");

					preco = sc.nextInt();
					sc.nextLine();
					System.out.println("Fragância: ");

					fragancia = sc.nextLine();
					produtos.atualizarProduto(new Cosmetico(id, nome, tipo, preco, fragancia));

					break;

				}
				
				break;

			case 3:

				System.out.println("Vamos deletar um produto!");

				System.out.println("Digite o ID do produto que você deseja deletar: ");

				id = sc.nextInt();
				sc.nextLine();

				produtos.deletarProduto(id);

				break;

			case 4:

				System.out.println("Vamos buscar por um produto!");

				System.out.println("Digite o ID do produto que você deseja buscar: ");

				id = sc.nextInt();
				sc.nextLine();

				produtos.consultarPorID(id);

				break;

			case 5:

				System.out.println("Listando todos os produtos armazenados: ");
				produtos.listarTodosProdutos();
				break;
				
			case 6:
				
				System.out.println("Programa Finalizado!");
				sc.close();
				System.exit(0);

			}

		}

	}

}
