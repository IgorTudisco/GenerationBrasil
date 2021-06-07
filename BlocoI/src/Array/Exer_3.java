package Array;

import java.util.Scanner;

public class Exer_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 3- Leia uma matriz 3 x 3, conte e escreva quantos
		 * valores maiores que 10 ela possui.
		 */
		
		Scanner read = new Scanner(System.in);
		
		int x = 3, y = 3, maior = 0;
		
		int [][] num = new int [x][y];
		
		for(int i = 0; i < x; i++) {
			
			for(int j = 0; j < y; j++) {
				
				System.out.println("\nDigite 9 números inteiros e aleatórios");
				num[i][j] = read.nextInt();
				
				boolean ok = num[i][j] > 10;
				
				if(ok) {
					
					maior++;
					
				}
				
			}
		}
		
		System.out.println("\nVocê digitou "
							+ maior
							+ " números maiores que 10");
		

	}

}
