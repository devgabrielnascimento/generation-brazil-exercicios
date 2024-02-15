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
			System.out.println("Digite o " + i +"° número : ");
			numero = sc.nextInt();
			setNumeros.add(numero);
		}
		
		Iterator<Integer> iNumeros = setNumeros.iterator();
		System.out.println("Listar dados do Set");
		while (iNumeros.hasNext()) {
			System.out.println("\r"+iNumeros.next());
		}
		
		
		sc.close();

	}

}
