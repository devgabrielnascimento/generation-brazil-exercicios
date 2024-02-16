package br.com.brazilgeneration.exercicios;


import java.util.Scanner;
import java.util.Stack;

public class Ex02 {

	public static void main(String[] args) {
		
		int opc;

		Stack<String> livros = new Stack<String>();

		Scanner sc = new Scanner(System.in);

		String menu = "*****************************************************\r\n"
				+ "\r   	   1 - Adicionar Livro na estante\r\n"
				+ "   	   2 - Listar todos os livros disponíveis\r\n"
				+ "   	   3 - Retirar Livro da estante \r\n"
				+ "   	   0 - Sair \r"
				+ "\r\n*****************************************************\r\n", nome;
		do {
			System.out.println(menu);
			System.out.println("Digite uma opção: ");
			opc = sc.nextInt();

			switch (opc) {

			case 1: {
				System.out.println("Digite o nome: ");
				sc.nextLine();
				nome = sc.nextLine();
				livros.push(nome);
				System.out.println("Pilha: ");
				listarLivrosEstante(livros);
				System.out.println("Livro adicionado na estante!");
				break;
			}

			case 2: {

				System.out.println("Lista de Livros disponíveis: ");
				//chamada do método que percorre a pilha
				listarLivrosEstante(livros);

				break;
			}

			case 3: {
				
				if (livros.isEmpty() == true) {
					System.out.println("A Estante está vazia!");
				}
				else {livros.pop();
				System.out.println("Pilha: ");
				listarLivrosEstante(livros);
				System.out.println("O livro foi retirado da estante!");
				}
				break;
			}

			case 0: {
				System.out.println("\r\n"
						+ "Programa Finalizado!\r\n"
						+ "");
				break;	
			}

			default: {
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
				break;
			}
			}
		}

		while (opc != 0);

		sc.close();
		
	}
	
	/* Método que realiza iterações dentro de uma pilha,
	   que é o tipo desse parâmetro. 
	*/
	public static void  listarLivrosEstante(Stack<String> livros) {
		for (String livro : livros) {
            System.out.println(livro);
        }
		
	}
}
