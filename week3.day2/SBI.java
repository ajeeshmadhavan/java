package org.college;

public abstract class SBI implements CIBIL,PNB {
    public void ITLoan() {
    	System.out.println("SBI IT Loan");
    }
    public abstract void bankBalance();
    public abstract void maximumLoanAmout();
	
}
