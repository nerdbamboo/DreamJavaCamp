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
		
		System.out.println("���� ���� : " + account + ", �ܾ� : " + balance + "��, ������ : " + interestRate);
		
		
	}
	
	public void inMoney(int income) {
		System.out.println(income + "���� �Ա� �մϴ�.");
		this.balance  += income;
	
		
		
	}
	public int interestIn() {
		
		balance += (int)((balance / 100) * interestRate);
		
		return balance;
		
	}
	
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println(money + "���� ����մϴ�.");
			balance = balance - money;
			
		}else {
			System.out.println("[�ַ�] �ܾ��� �����մϴ�.");
		}
		
	}
	
	
	
	
}