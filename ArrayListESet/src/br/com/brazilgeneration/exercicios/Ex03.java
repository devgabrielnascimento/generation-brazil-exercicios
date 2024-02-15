package br.com.brazilgeneration.exercicios;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		int numero;
		Scanner sc = new Scanner (System.in);
		
		
		for(int i = 1; i < 11; i++) {
			System.out.println("Digite um número: ");
			numero = sc.nextInt();
			setNumeros.add(numero);
		}
		
		Iterator<Integer> iNumeros = setNumeros.iterator();
		
		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		
		sc.close();

	}

}
