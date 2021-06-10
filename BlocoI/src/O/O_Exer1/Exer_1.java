package O.O_Exer1;

import java.util.Scanner;

public class Exer_1 {
	
	public static void main(String[] args) {
		
		/*
		 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
		 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
		 * informações deste objeto no console.
		 */
		
		Scanner read = new Scanner(System.in);
		
		String nomeClient, nomeProduto;
		double precoProduto;
		int idClient;
		
		System.out.println("\nColoque o ID do cliente ");
		idClient = read.nextInt();
		System.out.println("\nColoque o nome do cliente ");
		nomeClient = read.next();
		System.out.println("\nColoque o nome do produto ");
		nomeProduto = read.next();
		System.out.println("\nColoque o preço do produto ");
		precoProduto = read.nextDouble();
		
		Client compra = new Client(nomeClient, nomeProduto, precoProduto, idClient);
		
		compra.printClient();
		
		
	}
	
}
