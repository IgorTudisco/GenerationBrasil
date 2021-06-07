package Array;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		  2- Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.

		 */
		
		Scanner read = new Scanner(System.in);
		
		int x = 6, contPar = 0, contImpar = 0, totalPar = 0, totalImpar = 0;
		
		int [] num = new int [x];
		
		for(int i = 0; i < num.length; i++) {
			
			System.out.println("\n"
					+ "Entre com um número ");
			num[i] = read.nextInt();
			
			boolean ok = num[i] % 2 == 0;
			
			if (ok) {
				
				contPar++;
				totalPar += num[i];
				
			} else {
				
				contImpar++;
				totalImpar += num[i];
				
			}
		}
		
		System.out.println("\n\tO total de números pares digitados "
				+ contPar
				+ " e a sua soma deu "
				+ totalPar);
		System.out.println("\n\tO total de números impares digitados "
				+ contImpar
				+ " e a sua soma deu "
				+ totalImpar);
	}

}
