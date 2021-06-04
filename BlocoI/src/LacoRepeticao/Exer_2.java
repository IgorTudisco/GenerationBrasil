package LacoRepeticao;

import java.util.Scanner;

public class Exer_2 {
	public static void main(String[] args) {
		
		/*
		 * 2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Scanner read = new Scanner(System.in);
		
		int impar = 0, par = 0, num;
		
		System.out.println("Digite 10 números e veja "
				+ "quantos são pares e quantos são impares");
		num = read.nextInt();
		
		for(int i = 0; i <= 9; i++) {
									
			if(num % 2 == 0) {
				
				par++;
				
			} else {
				
				impar++;
				
			}
			
			num = read.nextInt();
						
		}
		
		System.out.println("\nDos 10 números digitados "
		+ par + " são par e " 
		+ impar + " saõ impar");
		
		
	}
}
