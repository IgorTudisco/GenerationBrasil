package LacoRepeticao;

import java.util.Scanner;

public class Exer_3 {
	
	public static void main(String[] args) {
		
		/*
		 * 3-	Solicitar a idade de várias pessoas e imprimir:
		 * Total de pessoas com menos de 21 anos.
		 * Total de pessoas com mais de 50 anos.
		 * O programa termina quando idade for =-99. (WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int idade, menor = 0, maior = 0;
		
		System.out.println("\nDigite a sua idade ");
		idade = read.nextInt();
				
		while(idade>=-99) {
			
			if(idade < 21) {
				
				menor++;
				
			} else if(idade > 50) {
				
				maior++;
				
			}
			
			System.out.println("\nDigite a sua idade ");
			idade = read.nextInt();
			
		}
		
		System.out.println("\n" + menor + " pessoas que tem menos de 21 anos");
		System.out.println("\n" + maior + " pessoas que tem mais de 50 anos");
		
	}

}
