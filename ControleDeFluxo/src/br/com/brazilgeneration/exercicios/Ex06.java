package br.com.brazilgeneration.exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		String colab;
		int cargo;
		float salario, novoSalario, reajuste;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do colaborador: ");
		colab = sc.nextLine();
	
		System.out.print("Cargo: ");
		cargo = sc.nextInt();
		
		System.out.print("Salário: ");
		salario = sc.nextFloat();
		
		
		switch (cargo) {
		case 1: 
			reajuste = 0.1f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Gerente");
			System.out.printf("Salário: R$ %.2f", novoSalario);
			
			break;
			
		case 2: 
			reajuste = 0.07f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Vendedor");
			System.out.printf("Salário: R$ %.2f", novoSalario);
			
			break;
	
		case 3: 
			reajuste = 0.09f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Supervisor");
			System.out.printf("Salário: R$ %.2f", novoSalario);
			
			break;
			
		case 4: 
			reajuste = 0.06f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Motorista");
			System.out.printf("Salário: R$ %.2f", novoSalario);
			
			break;
			
		case 5: 
			reajuste = 0.05f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Estoquista");
			System.out.printf("Salário: R$ %.2f", novoSalario);
			
			break;
			
		case 6: 
			reajuste = 0.08f;
			novoSalario = salario + (reajuste * salario);
			System.out.println("Nome do colaborador: " + colab);
			System.out.println("Cargo: Técnico de TI");
			System.out.printf("Salário: %.2f", novoSalario);
			
			break;
			
		}	
		
		sc.close();
		
	}

}
