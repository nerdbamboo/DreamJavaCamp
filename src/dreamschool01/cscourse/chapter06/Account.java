package dreamschool01.cscourse.chapter06;

public class Account {
	
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		balance += money;
	}
	
	int  withdraw(int money){
		if(money < 0) {
			System.out.println("[�ַ�]������ �Է��Ҽ� �����ϴ�.");
			return 0;
		}else if(money > balance) {
			System.out.println("[�ַ�] �ܾ��� �����մϴ�.");
			return 0;
		}
		else  {
			balance -= money;
			return money;
		}
		
	}
	void printAccountInfo() {
		System.out.println("���� : " + accNo + "(������ : " + accName + ")");
		
		
		System.out.println("�ܾ�  : " + balance);
	}

}
