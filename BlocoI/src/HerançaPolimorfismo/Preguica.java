package HerançaPolimorfismo;

public class Preguica extends Animal{
	
	public String country;
	public String region;

	public Preguica(String name, int idade, String country, String region) {
		super(name, idade);
		this.country = country;
		this.region = region;
	}

	public String getPais() {
		return country;
	}

	public void setPais(String pais) {
		this.country = pais;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	public void printPreguica() {
		
		printAnimal();
		System.out.println("\nVeio do pais " + country
				+ " e da região " + region);
		
	};
	

}
