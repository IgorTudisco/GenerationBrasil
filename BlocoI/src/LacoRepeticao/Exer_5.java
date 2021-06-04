package LacoRepeticao;

import java.util.Scanner;

public class Exer_5 {

	public static void main(String[] args) {
		
		/*
		 * 5-	Crie um programa que leia um número do
		 * teclado até que encontre um número igual a zero.
		 * No final,
		 * mostre a soma dos números digitados.(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num, cont = 1;
		
		System.out.println("\nDigite um número qual quer ");
		num = read.nextInt();
				
		do {
			
			if(num != 0) {
				
				cont += num;
				
			}
			
			System.out.println("\nDigite um número qual quer ");
			num = read.nextInt();
			
		}while(num != 0);
		
		System.out.println("\nA soma dos numeros " + cont);
		
	}

}
