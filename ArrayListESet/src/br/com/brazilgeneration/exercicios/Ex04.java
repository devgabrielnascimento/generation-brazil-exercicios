package br.com.brazilgeneration.exercicios;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		setNumeros.add(2);
		setNumeros.add(5);
		setNumeros.add(1);
		setNumeros.add(3);
		setNumeros.add(4);
		setNumeros.add(9);
		setNumeros.add(7);
		setNumeros.add(8);
		setNumeros.add(10);
		setNumeros.add(6);
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		
		numero = sc.nextInt();
		
		
		if (setNumeros != null && setNumeros.contains(numero)) {
			System.out.println("O número " + numero + " foi encontrado!");

		} 
		
		
		else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
		
		sc.close();
		

	}

}
