package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		
		num = sc.nextInt();
		
		if (num % 2 == 0 && num > 0) {
			
			System.out.print("O Número " + num + " é par e positivo!");
			
		} else if (num % 2 != 0 && num > 0) {
			
			System.out.print("O Número " + num + " é ímpar e positivo!");
			
		} else if (num % 2 == 0 && num < 0) {
			
			System.out.print("O Número " + num + " é par e negativo!");
			
		} else {
			
			System.out.print("O Número " + num + " é ímpar e negativo!");
		}
		
		
		sc.close();

	}

}
