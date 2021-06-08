package OrientacaoObijetoExer6;

import java.text.NumberFormat;

public class Bancaria {
	
	// Atributos
	
	public String name;
	public int id;
	public Double salary;
	
	// Construtor
	
	public Bancaria(String n, Double s) {
		
		this.name = setName(n);
		this.salary = setSalary(s);
						
	};
	
	// Set
	
	public String setName( String n) {
		
		return name = n;
		
	};
	
	public int setId( int num) {
		
		return id = num;
		
	};
	
	public double setSalary( Double s) {
		
		return salary = s;
		
	};
	
	// Get
	
	public void getName( String n) {
		
		name = n;
		
	};
	
	public void getId( int num) {
		
		id = num;
		
	};
	
	public void getSalary( Double s) {
		
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
		
		System.out.println("\nO sal�rio bruto do(a) "
		+ name
		+ " � de "
		+ formatCoinSalary()
		+ " o seu salario b�si � "
		+ formatCoinNewSalary()
		+ tax ());		
	}
	
}
