package Array;

import java.util.Scanner;

public class Exer_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * (4) imprimir as matrizes
		 * Nas duas primeiras opções uma terceira matriz 2 x 2
		 * deve ser criada. Na terceira opção o valor da constante
		 * deve ser lido e o resultado da adição da constante deve ser
		 * armazenado na própria matriz.
		 * 
		 */
		
		Scanner read = new Scanner(System.in);
		
		int op, x = 2, y = 2, constante;
		
		int [][] array1 = new int[x][y];
		int [][] array2 = new int[x][y];
		
		System.out.println("\n\tEscolha uma opção: ");
		System.out.println("\n1 para matriz 2x2: ");
		System.out.println("\n2 para matriz 2x2: ");
		System.out.println("\n3 para matriz 2x2 mais constante: ");
		op = read.nextInt();
	
		switch(op) {
		
		case 1:
			
			System.out.println("\n\tDigite 4 números para matriz 1");
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					array1[i][j] = read.nextInt();
					
				}
				
			}
			
			System.out.println("\n\tDigite 4 números para matriz 2");
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {

					array2[i][j] = read.nextInt();
					
				}
				
			}
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					array1[i][j]+=array2[i][j];
					
					System.out.println("\nOs valores do seu array1: " + array1[i][j]);
					
				}
				
			}
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {

					System.out.println("\nOs valores do seu array2: " + array2[i][j]);
					
				}
				
			}
				
			break;
			
		case 2:
			
			System.out.println("\n\tDigite 4 números para matriz 1");
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					array1[i][j] = read.nextInt();
					
				}
				
			}
			
			System.out.println("\n\tDigite 4 números para matriz 2");
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {

					array2[i][j] = read.nextInt();
					
				}
				
			}
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					System.out.println("\nOs valores do seu array1: " + array1[i][j]);
					
				}
				
			}
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					array2[i][j]+=array1[i][j];

					System.out.println("\nOs valores do seu array2: " + array2[i][j]);
					
				}
				
			}
							
			break;
			
		case 3:
			
			System.out.println("\nDigite o valor real de uma constante: ");
			constante = read.nextInt();
			
			System.out.println("\n\tDigite 4 números para cada matriz");
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					array1[i][j] = read.nextInt() + constante;
					
				}
				
			}
			
			for (int i = 0; i < x; i++) {
				
				for(int j = 0; j < y; j++) {
					
					System.out.println("\nOs valores do seu array: " + array1[i][j]);
					
				}
				
			}
				
			break;
			
		default:
		    System.out.println("Número errado");			
		
		}

	}

}
