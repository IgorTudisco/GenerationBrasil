package Basic;

import java.util.Scanner;

public class Exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos,
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		int day, month, year, dia, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o dia do seu anivers�rio ");
		day = leia.nextInt();
		
		System.out.println("\nDigite o m�s do seu anivers�rio ");
		month = leia.nextInt();
		
		System.out.println("\nDigite o quantos anos voc� do seu anivers�rio ");
		year = leia.nextInt();
		
		soma = day + 30 * month + 365 * year;
		
		System.out.println("\nSua idade em dias � " + soma);
		

	}

}
