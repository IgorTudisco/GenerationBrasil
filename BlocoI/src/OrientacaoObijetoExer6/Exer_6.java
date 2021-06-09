package OrientacaoObijetoExer6;

import java.util.Scanner;

public class Exer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 6) Crie uma classe conta bancaria e apresente os atributos e métodos
		 * referentes esta classe, em seguida crie um objeto conta bancaria, defina as
		 * instancias deste objeto e apresente as informações deste objeto no console.
		 */

		Scanner read = new Scanner(System.in);

		int eqtPessoas;
		String name;
		double salary;

		System.out.println("\nO imposto de quantas" + "pessoas você deseja ver? ");
		eqtPessoas = read.nextInt();

		Bancaria[] pessoas = new Bancaria[eqtPessoas];

		for (int i = 0; i < eqtPessoas; i++) {

			System.out.println("\nDigite o nome: ");
			name = read.next();
			System.out.println("\nDigite o salário: ");
			salary = read.nextDouble();

			pessoas[i] = new Bancaria(name, salary);

		}

		for (Bancaria p : pessoas) {

			p.printStatement();

		}
		;

	}

}
