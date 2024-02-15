package br.com.brazilgeneration.exercicios;

public class Ex02 {

	public static void main(String[] args) {


		int matriz[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, somaDiagPrincipal = 0, somaDiagSecundaria = 0, il = 0, ic = 0;

		System.out.println("Elementos da Diagonal Principal: ");
		for ( il = 0; il < 3; il++) {
			for ( ic = 0; ic < 3; ic++) {
				if (il == ic)  {
					System.out.print(" " + matriz[il][ic]);
					somaDiagPrincipal += matriz[il][ic];
				}  

			} 

		}		


		System.out.println("\nElementos da Diagonal Secundária:");
		for (il = 0; il < 3; il++) {
			for (ic = 0; ic < 3; ic++) {

				if (il == 2 && ic == 0 || il == 1 && ic == 1 || il == 0 && ic == 2) {
					System.out.print(" " + matriz[il][ic]);
					somaDiagSecundaria += matriz[il][ic];

				}
	
			} 
		
		}


		System.out.println("\nSoma dos Elementos da Diagonal Principal: " + somaDiagPrincipal);
		System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + somaDiagSecundaria);
	}
	
}