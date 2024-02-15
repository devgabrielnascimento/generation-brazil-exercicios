package br.com.brazilgeneration.exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int opc;

		Queue<String> fila = new LinkedList<String>();

		Scanner sc = new Scanner(System.in);

		String menu = "*****************************************************\r\n"
				+ "\r   	   1 - Adicionar Cliente na Fila\r\n"
				+ "   	   2 - Listar todos os Clientes\r\n"
				+ "   	   3 - Retirar Cliente da Fila \r\n"
				+ "   	   0 - Sair \r"
				+ "\r\n*****************************************************\r\n", nome;


		do {

			System.out.println(menu);
			System.out.println("Digite uma opção: ");
			opc = sc.nextInt();

			switch (opc) {

			case 1: {
				System.out.println("Digite o nome: ");
				nome = sc.next();
				fila.add(nome);
				System.out.println("Livro adicionado!");
				break;
			}

			case 2: {

				System.out.println("Lista de livros na pilha: ");
				System.out.println(fila);

				break;
			}

			case 3: {
				
				if (fila.isEmpty() == true) {
					System.out.println("A Fila está vazia!");
				}
				else {fila.remove();
				System.out.println("Pilha: ");
				System.out.println(fila);
				System.out.println("Livro removido!");
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

}
