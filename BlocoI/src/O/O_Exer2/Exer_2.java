package O.O_Exer2;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe,
		 * em seguida crie um objeto avi�o,
		 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.
		 */
		
		Scanner read = new Scanner (System.in);
		
		String modelo;
		double peso;
		int qtePassageiros;
		
		System.out.println("\n\tEntre com os dados do Avi�o: ");
		System.out.println("\n- Modelo ");
		modelo = read.next();
		System.out.println("\n- Peso ");
		peso = read.nextDouble();
		System.out.println("\n- Quantidade de passageiros ");
		qtePassageiros = read.nextInt();
		
		Aviao veiculo1 = new Aviao(modelo, peso, qtePassageiros);
		
		veiculo1.printAviao();
		

	}

}
