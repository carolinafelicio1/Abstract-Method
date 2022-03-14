package br.com.felicio;

public abstract class AbstractFactory {
	
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);

}
