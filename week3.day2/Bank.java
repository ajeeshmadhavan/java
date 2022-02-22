package org.college;

public class Bank extends SBI{

	public void cibilScore() {
		// TODO Auto-generated method stub
		int score=700;
		System.out.println("cibil score"+" "+score);
	}

	public void creditScore() {
		// TODO Auto-generated method stub
		System.out.println("credit score 4");
	}

	public void minimumBalance() {
		// TODO Auto-generated method stub
		System.out.println("minimum balance 1000");
	}

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		float balance= 19987.50f;
		System.out.println("balance"+" "+balance);
	}

	@Override
	public void maximumLoanAmout() {
		// TODO Auto-generated method stub
		System.out.println("maximum amt 100000");
	}
	public static void main(String[] args) {
		Bank bank=new Bank();
		bank.cibilScore();
		bank.maximumLoanAmout();
		bank.creditScore();
		bank.minimumBalance();
		bank.ITLoan();
		bank.bankBalance();
}
}
