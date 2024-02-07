package br.com.brazilgeneration.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float nota1 = 10.0f;
		
		float nota2 = 8.07f;
		
		float nota3 = 7.0f;
		
		float nota4 = 7.5f;
		
		float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
			
		//Usando um format para colocar apenas uma casa após a vírgula
		
		System.out.printf("Média final: %.1f", mediaFinal);
		
	}
	
}
