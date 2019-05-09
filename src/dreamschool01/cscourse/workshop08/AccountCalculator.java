package dreamschool01.cscourse.workshop08;

public class AccountCalculator {
	
	String number;
	int balance;
	double interestRate;
	
	public AccountCalculator(String number, int balance, double interestRate) {
		
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
		
	}
	
	public int calculateInterest() {
		int interest = (int)(this.balance * this.interestRate / 100);
		balance  += interest;
		return interest;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


}
