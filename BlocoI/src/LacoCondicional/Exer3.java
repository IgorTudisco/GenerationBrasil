package LacoCondicional;

import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) {
		
		/*
		 * 3-	Faça um programa que receba a idade de uma pessoa
		 * e mostre na saída em qual categoria ela se encontra:
			10-14 infantil
			15-17 juvenil
			18-25 adulto
		 */
		
		int num;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		num = read.nextInt();
		
		if(num >= 10 & num <= 14) {
			
			System.out.println("Categoria Infantil");
			
		} else if(num >= 15 & num <= 17) {
			
			System.out.println("Categoria Juvenil");
			
		} else if(num >= 18 & num <= 25) {
			
			System.out.println("Categoria Adulto");
			
		} else {
			
			System.out.println("Você está fora da categoria de competição");
			
		}		
		
	}

}
