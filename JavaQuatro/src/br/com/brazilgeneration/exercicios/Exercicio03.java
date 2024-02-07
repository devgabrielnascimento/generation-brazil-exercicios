package br.com.brazilgeneration.exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		
		float salarioBruto = 2000.00f;
		float adicionalNoturno = 500.00f;
		
		float horasExtras = 100.00f;
		
		float descontos = 200.00f;
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("Salário Líquido: " + salarioLiquido);
		
	}

}
