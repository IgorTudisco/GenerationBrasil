package LacoRepeticao;

import java.util.Scanner;

public class Exer_2 {
	public static void main(String[] args) {
		
		/*
		 * 2-	Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int impar = 0, par = 0, num;
		
		System.out.println("Digite 10 n�meros e veja "
				+ "quantos s�o pares e quantos s�o impares");
		num = read.nextInt();
		
		for(int i = 0; i <= 9; i++) {
									
			if(num % 2 == 0) {
				
				par++;
				
			} else {
				
				impar++;
				
			}
			
			num = read.nextInt();
						
		}
		
		System.out.println("\nDos 10 n�meros digitados "
		+ par + " s�o par e " 
		+ impar + " sa� impar");
		
		
	}
}
