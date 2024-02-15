package br.com.brazilgeneration.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		String cor;
		
		
		
		for(int i = 1; i < 6; i++) {
			System.out.println("Digite uma cor: ");
			cor = sc.next();
			cores.add(cor);
		}
		
		Iterator<String> iCores = cores.iterator();
		System.out.println("\nListar as cores: \n");
		while (iCores.hasNext()) {
			System.out.println(iCores.next());
		}
		
		
		cores.sort(null);
		Iterator<String> iCcores = cores.iterator();
		System.out.println("\nOrdenar as cores: \n");
		while (iCcores.hasNext()) {
			System.out.println(iCcores.next());
		}
	
		sc.close();

	}

}
