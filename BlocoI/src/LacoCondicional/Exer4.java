package LacoCondicional;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 4-	Fa�a um programa em que permita a entrada de um n�mero qualquer
		 * e exiba se este n�mero � par ou �mpar.
		 * Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		 * �mpar exiba o n�mero elevado ao quadrado.
		 */
		
		double num, raiz, quadrado;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um n�mero ");
		num = read.nextDouble();
		
		if ((num % 2) == 0) {
			
			System.out.println("O n�mero " + num + " � par");
			raiz = Math.sqrt(num);
			System.out.println("E sua raiz � " + raiz);			
			
		} else {
			
			System.out.println("O n�mero " + num + " � impar");
			quadrado = Math.pow(num,2);
			System.out.println("E seu quadrado � " + quadrado);			
			
		}

	}

}
