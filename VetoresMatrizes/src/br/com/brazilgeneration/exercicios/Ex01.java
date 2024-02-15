package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int numeros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 16}, numero;

		boolean numeroEncontrado = false;


		System.out.println("Digite o número que você deseja encontrar: ");
		numero = sc.nextInt();
		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] == numero) {
				numeroEncontrado = true;
				System.out.println("O número " + numero + " está localizado na posição: " + i);			} 


		}

		if (!numeroEncontrado) {
			System.out.println("O número " + numero +" não foi encontrado!");
		}


		sc.close();
	}

}
