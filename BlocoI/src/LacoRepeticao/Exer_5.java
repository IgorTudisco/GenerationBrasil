package LacoRepeticao;

import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		
		/*
		 * 5-	Crie um programa que leia um n�mero do
		 * teclado at� que encontre um n�mero igual a zero.
		 * No final,
		 * mostre a soma dos n�meros digitados.(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num, cont = 1;
		
		System.out.println("\nDigite um n�mero qual quer ");
		num = read.nextInt();
				
		do {
			
			if(num != 0) {
				
				cont += num;
				
			}
			
			System.out.println("\nDigite um n�mero qual quer ");
			num = read.nextInt();
			
		}while(num != 0);
		
		System.out.println("\nA soma dos numeros " + cont);
		
	}

}
