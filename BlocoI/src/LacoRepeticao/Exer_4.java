package LacoRepeticao;

import java.util.Scanner;

public class Exer_4 {
	
	public static void main(String[] args) {
		
		/*
		 * 4-	Uma empresa desenvolveu uma pesquisa para saber
		 * as características psicológicas dos indivíduos de uma região.
		 * Para tanto, a cada uma das pessoas era perguntado: idade,
		 * sexo (1-feminino / 2-masculino / 3-Outros),
		 * e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3,
		 * se a pessoa era agressiva). Pede-se para elaborar um sistema que permita
		 * ler os dados de 150 pessoas, calcule e mostre: (WHILE)
			•	o número de pessoas calmas; 
			•	o número de mulheres nervosas; 
			•	o número de homens agressivos; 
			•	o número de outros calmos;
			•	o número de pessoas nervosas com mais de 40 anos; 
			•	o número de pessoas calmas com menos de 18 anos.
		 */
		
		Scanner read = new Scanner(System.in);
		
		int idade, num1, num2, i = 0;
		int contF = 0, contM = 0, contO = 0;
		int contC = 0, contN = 0, contA = 0;
		int contNmais = 0, contCmenos = 0;
		
		System.out.println("\nPesquisa");
		
		System.out.println("Digite sua idade");
		idade = read.nextInt();
		
		System.out.println("(1-feminino / 2-masculino / 3-Outros)");
		num1 = read.nextInt();
		
		System.out.println("(1 para uma pessoa calma; 2,"
				+ " para uma pessoa nervosa e 3 para uma pessoa era agressiva)");
		num2 = read.nextInt();
		
		while(i <= 150){
			
			if(num1 == 1) {
				
				contF++;
				
			} else if(num1 == 2) {
				
				contM++;
				
			} else if(num1 == 3) {
				
				contO++;
				
			};
			
			if(num2 == 1) {
				
				contC++;
				
				if (idade < 18) {
					
					contCmenos++;
					
				};
				
			} else if(num2 == 2) {
				
				contN++;
				
				if (idade > 40) {
					
					contNmais++;
					
				};
				
			} else if(num2 == 3) {
				
				contA++;
				
			};
			
			System.out.println("Digite sua idade");
			idade = read.nextInt();
			
			System.out.println("(1-feminino / 2-masculino / 3-Outros)");
			num1 = read.nextInt();
			
			System.out.println("(1 para uma pessoa calma; 2,"
					+ " para uma pessoa nervosa e 3 para uma pessoa era agressiva)");
			num2 = read.nextInt();

			i++;
			
		};
		
		System.out.println("\nPessoas do sexo Feminino " + contF);
		System.out.println("\nPessoas do sexo Masculino " + contM);
		System.out.println("\nPessoas do sexo Outros " + contO);
		System.out.println("\nPessoas Calmas " + contC);
		System.out.println("\nPessoas Calmas com menos de " + contC);
		System.out.println("\nPessoas nervosas " + contN);
		System.out.println("\nPessoas nervosas com mais de 40 anos " + contNmais);
		System.out.println("\nPessoas agressivas " + contA);

		
	};

};
