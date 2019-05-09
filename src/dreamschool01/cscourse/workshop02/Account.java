package dreamschool01.cscourse.workshop02;

public class Account {
	
	String account;
	int balance;
	double interestRate;
	int interest;
	
	Account(String account, int balance, double interestRate){
		
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
		
		}
	public void printAccountInfo() {
		
		System.out.println("계좌 정보 : " + account + ", 잔액 : " + balance + "원, 이자율 : " + interestRate);
		
		
	}
	
	public void inMoney(int income) {
		System.out.println(income + "원을 입금 합니다.");
		this.balance  += income;
	
		
		
	}
	public int interestIn() {
		
		balance += (int)((balance / 100) * interestRate);
		
		return balance;
		
	}
	
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println(money + "원을 출금합니다.");
			balance = balance - money;
			
		}else {
			System.out.println("[애러] 잔액이 부족합니다.");
		}
		
	}
	
	
	
	
}