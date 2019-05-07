package dreamschool01.cscourse.chapter06;

public class Account {
	
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int withdraw(int money){
		balance -= money;
		return money;
	}
	void printAccountInfo() {
		System.out.println("예금주 : " + accName);
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액  : " + balance);
	}

}
