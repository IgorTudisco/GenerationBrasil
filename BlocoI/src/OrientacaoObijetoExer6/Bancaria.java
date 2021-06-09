package OrientacaoObijetoExer6;

import java.text.NumberFormat;

public class Bancaria {
	
	// Atributos
	
	public String name;
	public int id;
	public Double salary;
	
	// Construtor
	
	public Bancaria(String n, Double s) {
		
		this.name = getName(n);
		this.salary = getSalary(s);
						
	};
	
	// Get
	
	public String getName( String n) {
		
		return n;
		
	};
	
	public int getId( int num) {
		
		return num;
		
	};
	
	public double getSalary( Double s) {
		
		return s;
		
	};
	
	// Set
	
	public void setName( String n) {
		
		name = n;
		
	};
	
	public void setId( int num) {
		
		id = num;
		
	};
	
	public void setSalary( Double s) {
		
		salary = s;
		
	};
	
	public double taxSalary() {
		
		double salaryAno = salary * 12;
		double tax;
		double NewSalarey;
		
		if(salaryAno <= 28000) {
			
			tax = salary * 0.15;
			NewSalarey = salary - tax;
			
		} else if(salaryAno > 28000 && salaryAno < 42000) {
			
			tax = salary * 0.16;
			NewSalarey = salary - tax;
		} else {
			
			tax = salary * 0.18;
			NewSalarey = salary - tax;
		}
		
		return NewSalarey;
		
	};
	
	// Methods
	
	public String formatCoinSalary() {
		
		NumberFormat exchange = NumberFormat.getCurrencyInstance();
		exchange.setMinimumFractionDigits(2);
		String formatCoinSalary = exchange.format(salary);
		return formatCoinSalary;
		
	}
	
	public String formatCoinNewSalary() {
		
		NumberFormat exchange = NumberFormat.getCurrencyInstance();
		exchange.setMinimumFractionDigits(2);
		String formatCoinNewSalary = exchange.format(taxSalary());
		return formatCoinNewSalary;
		
	}
	
	public String tax () {
		
		double salaryAno = salary * 12;
		double tax;
				
		if(salaryAno <= 28000) {
			
			tax = 15;
			
		} else if(salaryAno > 28000 && salaryAno < 42000) {
			
			tax = 16;
			
		} else {
			
			tax = 18;
		}
		
		String taxPrint = " imposto pago " + tax + "%";
		
		return taxPrint;
		
	}
	
	public void printStatement() {
		
		System.out.println("\nO salário bruto do(a) "
		+ name
		+ " é de "
		+ formatCoinSalary()
		+ " o seu salario bási é "
		+ formatCoinNewSalary()
		+ tax ());		
	}
	
}
