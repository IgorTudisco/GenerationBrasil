package O.O_Exer2;

public class Aviao {
	
	// Atributos
	
	public String modelo;
	public Double peso;
	public int qtePassageiros;
	
	// Contructors

	public Aviao(String modelo, Double peso, int qtePassageiros) {
		
		this.modelo = modelo;
		this.peso = peso;
		this.qtePassageiros = qtePassageiros;
		
	}
	
	public void printAviao() {
		
		System.out.println("\nO avião do modelo " + modelo
				+ " pesa " + peso
				+ " tem capassidade para " + qtePassageiros + " passageiro.");
		
	}
	
	// Get and Sets

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public int getQtePassageiros() {
		return qtePassageiros;
	}

	public void setQtePassageiros(int qtePassageiros) {
		this.qtePassageiros = qtePassageiros;
	};
	
	
	
}
