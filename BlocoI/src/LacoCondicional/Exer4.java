package LacoCondicional;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 4-	Faça um programa em que permita a entrada de um número qualquer
		 * e exiba se este número é par ou ímpar.
		 * Se for par exiba também a raiz quadrada do mesmo; se for
		 * ímpar exiba o número elevado ao quadrado.
		 */
		
		double num, raiz, quadrado;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um número ");
		num = read.nextDouble();
		
		if ((num % 2) == 0) {
			
			System.out.println("O número " + num + " é par");
			raiz = Math.sqrt(num);
			System.out.println("E sua raiz é " + raiz);			
			
		} else {
			
			System.out.println("O número " + num + " é impar");
			quadrado = Math.pow(num,2);
			System.out.println("E seu quadrado é " + quadrado);			
			
		}

	}

}
