package HerançaPolimorfismo;

public class Cavalo extends Animal{
	
	public String typeFood;
	public boolean trained;
	
	public Cavalo(String name, int idade, String typeFood, boolean trained) {
		super(name, idade);
		this.typeFood = typeFood;
		this.trained =trained;
	}

	public String getTypeFood() {
		return typeFood;
	}

	public void setTypeFood(String typeFood) {
		this.typeFood = typeFood;
	}

	public boolean isTrained() {
		return trained;
	}

	public void setTrained(boolean trained) {
		this.trained = trained;
	}
	
	public void printCavalo() {
		
		printAnimal();
		System.out.println("\nO tipo de comida do Calavo é: " + typeFood
				+ "\nO cavalo foi domesticado ? " + trained);
		
	}


}
