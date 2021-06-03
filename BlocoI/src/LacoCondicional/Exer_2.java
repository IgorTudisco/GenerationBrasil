package LacoCondicional;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2-	Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int num1, num2, num3;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 3 números: ");
		
		System.out.println("Digite 1º números: ");
		num1 = read.nextInt();
		
		System.out.println("Digite 2º números: ");
		num2 = read.nextInt();
		
		System.out.println("Digite 3º números: ");
		num3 = read.nextInt();
		
		if (num1 < num2 & num1 < num3 ) {
			
			System.out.println(num1);
			
			if (num2 < num3) {
				
				System.out.println(num2);
				System.out.println(num3);

			} else {
				
				System.out.println(num3);
				System.out.println(num2);
				
			}
			
		} else if (num2 < num1 & num2 < num3) {
			
			System.out.println(num2);
			
			if (num1 < num3) {
				
				System.out.println(num1);
				System.out.println(num3);

			} else {
				
				System.out.println(num3);
				System.out.println(num1);
				
			}
			
		} else if (num3 < num1 & num3 < num2) {
			
			System.out.println(num3);
			
			if (num1 < num2) {
				
				System.out.println(num1);
				System.out.println(num2);

			} else {
				
				System.out.println(num2);
				System.out.println(num1);
				
			}
			
		} else {
			
			System.out.println("Os números são iguais... " + num1);
			
		}
		

	}

}
