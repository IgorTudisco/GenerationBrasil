package LacoRepeticao;

import java.util.Scanner;

public class Exer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 6-	Escrever um programa que receba v�rios n�meros inteiros no teclado.
		 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3.
		 * Para sair digitar 0(zero).(DO...WHILE)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int num, contMutiplo = 0, num3 = 0, media;
		
		System.out.println("\nDigite um n�mero qual quer ");
		num = read.nextInt();
				
		do {
			
			if(num != 0) {
				
				if(num % 3 == 0) {
					
					contMutiplo++;
					num3+= num;
										
				}
				
			}
			
			System.out.println("\nDigite um n�mero qual quer ");
			num = read.nextInt();
			
		}while(num != 0);
		
		media = num3/contMutiplo;
		
		System.out.println("\nA m�dia dos n�meros mutiplos de 3 �: " + media);

	}

}
