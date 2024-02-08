package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		int A, B, C, soma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número A: ");
		A = sc.nextInt();
		System.out.print("Digite o número B: ");
		B = sc.nextInt();
		System.out.print("Digite o número C: ");
		C = sc.nextInt();
		
		soma = A + B;
		
		if (soma > C ) {
			System.out.print(B + " + " + A + " = " + soma + " > " + C);
			System.out.print("\nA Soma de A + B é Maior do que C");
		}
		
		if (soma < C ) {
			System.out.print(B + " + " + A + " = " + soma + " < " + C);
			System.out.print("\nA Soma de A + B é Menor do que C");
		}
		
		if (soma == C ) {
			System.out.print(B + " + " + A + " = " + soma + " = " + C);
			System.out.print("\nA Soma de A + B é Igual a C");
		}
		
		sc.close();
			
	}

}
