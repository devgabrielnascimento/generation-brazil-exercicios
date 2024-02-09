package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int num, soma;
		soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if (num > 0) {

				soma += num;
			}
			
		} while (!(num == 0));
		
		System.out.println("A soma dos números positivos é: " + soma);

		sc.close();
	}

}
