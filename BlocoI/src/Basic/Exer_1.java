package Basic;

import java.util.Scanner;

public class Exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos,
		 * meses e dias e mostre-a expressa apenas em dias. 
		 */
		
		int day, month, year, dia, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o dia do seu aniversário ");
		day = leia.nextInt();
		
		System.out.println("\nDigite o mês do seu aniversário ");
		month = leia.nextInt();
		
		System.out.println("\nDigite o quantos anos você do seu aniversário ");
		year = leia.nextInt();
		
		soma = day + 30 * month + 365 * year;
		
		System.out.println("\nSua idade em dias é " + soma);
		

	}

}
