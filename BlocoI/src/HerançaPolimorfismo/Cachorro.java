package HerançaPolimorfismo;

public class Cachorro extends Animal {
	
	public String species;
	public Double weight;
	public String size;

	public Cachorro(String name, int idade, String species, Double weight, String size) {
		super(name, idade);
		this.species = getSpecies(species);
		this.weight = getWeight(weight);
		this.size = getSize(size);
		
	};
	
	// Get
	
	public String getSpecies(String species) {
		
		return species;
		
	};
	public Double getWeight(Double weight) {
		
		return weight;
		
	};
	public String getSize(String size) {
		
		return size;
		
	};
	
	// Set
	
	public void setSpecies(String species) {
		
		this.species = species;
		
	};
	public void setWeight(Double weight) {
		
		this.weight = weight;
		
	};
	public void setSize(String size) {
		
		this.size = size;
		
	};
	
	public void printCachorro() {
		
		printAnimal();
		System.out.println("\nEspécie: " + species
				+ "\nPeso: " + weight
				+ "\nPorte: " + size);
		
	}

}
