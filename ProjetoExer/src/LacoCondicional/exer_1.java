package LacoCondicional;

import java.util.Scanner;

public class exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-	Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		float num1, num2, num3;
		
		System.out.println("Digite 3 n�meros");
		Scanner read = new Scanner(System.in);

		System.out.println("Digite o 1� n�mero ");
		num1 = read.nextFloat();

		System.out.println("Digite o 2� n�mero ");
		num2 = read.nextFloat();

		System.out.println("Digite o 3� n�mero ");
		num3 = read.nextFloat();
		
		if (num1 > num2 & num1 > num3 ) {
			
			System.out.println("O maior n�mero � o " + num1);
			
		} else if (num2 > num1 & num2 > num3) {
			
			System.out.println("O maior n�mero � o " + num2);
			
		} else if (num3 > num1 & num3 > num2) {
			
			System.out.println("O maior n�mero � o " + num3);
			
		} else {
			
			System.out.println("Os n�meros s�o iguais... " + num1);
			
		}
			

	}

}
