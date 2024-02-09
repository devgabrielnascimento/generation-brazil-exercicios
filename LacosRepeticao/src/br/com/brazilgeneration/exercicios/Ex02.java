package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		int idade, menores21, maiores50;
		
		Scanner sc = new Scanner(System.in);
		
		idade = 1;
		menores21 = 0;
		maiores50 = 0;
		
		while (idade > 0) {
		System.out.println("Digite uma idade: ");
		idade = sc.nextInt();
		
		if(idade > 0 && idade < 21) {
			
			menores21++;
		}
		
		if (idade > 50) {
			
			maiores50++;
		}
		
		
		
		
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + menores21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiores50);
		
		sc.close();
	}
}
