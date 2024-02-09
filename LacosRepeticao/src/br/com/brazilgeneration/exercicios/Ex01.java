package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
			
		int numeroInicio, numeroFinal, i, t;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número do intervalo: ");
		numeroInicio = sc.nextInt();
		System.out.print("Digite o último número do intervalo: ");
		numeroFinal = sc.nextInt();

		 if (numeroInicio >= numeroFinal) {
				System.out.println("Intervalo Inválido!");
			}	
			
		for (t = 0; t < 1; t++) {
			if (numeroInicio < numeroFinal) {
				System.out.println("\nNo Intervalo entre " + numeroInicio + " e " + numeroFinal + ": \n");
			}
			
		 for (i = numeroInicio; i < numeroFinal; i++) {
			if (i % 3 == 0 && i % 5 == 0 ) {
				System.out.println(i + " é múltiplo de 3 e 5");
				
			} 
			sc.close();
		 }
		}
	}
}
