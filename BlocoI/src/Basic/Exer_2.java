package Basic;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2. Faça um sistema que leia a
		 * idade de uma pessoa expressa em dias e mostre-a
		 * expressa em anos, meses e dias. 
		 */
		
		int total, dia, ano, mes;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nEntre com um número de dias ");
		total = read.nextInt();
		
		ano = (total / 365);
		mes = (total % 365) / 30;
		dia = (total % 365);
		
		System.out.println("A data é " + ano + "/" + mes +"/"+ dia);
		

	}

}
