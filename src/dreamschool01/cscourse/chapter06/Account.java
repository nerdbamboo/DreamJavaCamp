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
		System.out.println("������ : " + accName);
		System.out.println("���¹�ȣ : " + accNo);
		System.out.println("�ܾ�  : " + balance);
	}

}
