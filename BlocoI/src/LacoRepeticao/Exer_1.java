package LacoRepeticao;

public class Exer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1-	Informar todos os números de 1000 a 1999 que quando divididos
		 * por 11 obtemos resto = 5. (FOR)
		 */
		

		System.out.println("\nNúmeros de 1000 á 1999 "
				+ "que quando divididos por 11 o resto é 5");
		
		for(int i = 1000; i >= 1000 && i < 1999; i++) {
			
			if(i % 11 == 5) {
				System.out.println(i);
			}
			
		}
		

	}

}
