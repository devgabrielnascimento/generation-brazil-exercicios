package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int produto, quantidade;
		double preco, valorTotal;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Código do produto: ");
		produto = sc.nextInt();
		System.out.print("Quantidade: ");
		quantidade = sc.nextInt();
			
		switch (produto) {
		
		case 1: 
			
			preco = 10.00;
			valorTotal = quantidade * preco;
			System.out.println("Produto: Cachorro Quente");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;
		
		case 2: 
			preco = 15.00;
			valorTotal = quantidade * preco;
			System.out.print("Produto: X-Salada");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;
		
		case 3: 
			preco = 18.00;
			valorTotal = quantidade * preco;
			System.out.print("Produto: X-Bacon");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;
		
		case 4: 
			preco = 12.00;
			valorTotal = quantidade * preco;
			System.out.print("Produto: Bauru");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;
		
		case 5: 

			preco = 8.00;
			valorTotal = quantidade * preco;
			System.out.print("Produto: Refrigerante");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;

		case 6: 

			preco = 13.00;
			valorTotal = quantidade * preco;
			System.out.print("Produto: Suco de laranja");
			System.out.printf("\nValor total: R$ %.2f", valorTotal);
		break;
		}
		
		sc.close();
	}

}
