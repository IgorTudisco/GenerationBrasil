package LacoCondicional;

import java.util.Scanner;

public class exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		float num1, num2, num3;
		
		System.out.println("Digite 3 números");
		Scanner read = new Scanner(System.in);

		System.out.println("Digite o 1º número ");
		num1 = read.nextFloat();

		System.out.println("Digite o 2º número ");
		num2 = read.nextFloat();

		System.out.println("Digite o 3º número ");
		num3 = read.nextFloat();
		
		if (num1 > num2 & num1 > num3 ) {
			
			System.out.println("O maior número é o " + num1);
			
		} else if (num2 > num1 & num2 > num3) {
			
			System.out.println("O maior número é o " + num2);
			
		} else if (num3 > num1 & num3 > num2) {
			
			System.out.println("O maior número é o " + num3);
			
		} else {
			
			System.out.println("Os números são iguais... " + num1);
			
		}
			

	}

}
