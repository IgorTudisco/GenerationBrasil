package Basic;

import java.util.Scanner;

public class Exer_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Exer 3
		 Fa�a um sistema que leia o tempo de dura��o de um evento em
		 uma f�brica expressa em segundos e mostre-o expresso em horas,
		 minutos e segundos. 
		 */
		 
		int total, hora, minuto, segundo;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nColoque o tempo da partida em segundos ");
		total = read.nextInt();
		
		hora = total / 3600;
		minuto = (total % 3600) / 60;
		segundo = (total % 3600) % 60;
		
		System.out.println("\nA dura��o da partida foi de " + hora + ":" + minuto + ":" + segundo);
		

	}

}
