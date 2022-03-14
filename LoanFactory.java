package br.com.felicio;

public class LoanFactory extends AbstractFactory {

	//@Override
	public Bank getBank(String bank) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public Loan getLoan(String loan){
		if(loan==null){
		// TODO Auto-generated method stub
		return null;
	}
	
	if(loan.equalsIgnoreCase("Home")) {
		return new HomeLoan();
		
	}else if(loan.equalsIgnoreCase("Bussiness")) {
		
	}else if(loan.equalsIgnoreCase("Education")) {
		return new EducationLoan();
	}
	return null;
}}
