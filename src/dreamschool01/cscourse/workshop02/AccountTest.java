package dreamschool01.cscourse.workshop02;

public class AccountTest {

	public static void main(String[] args) {
		Account ac = new Account("441 - 0290 - 1234", 500000, 7.3);
		
		ac.printAccountInfo();
		ac.inMoney(20000);
		
		ac.printAccountInfo();
		
		System.out.print("\n>> 이자를 지급합니다:");
		int interest = ac.interestIn();
		System.out.println(interest);
		
		ac.interestIn();
		ac.printAccountInfo();
		
		ac.withdraw(150000);
		ac.printAccountInfo();
		
		ac.withdraw(500000);
		
		ac.printAccountInfo();
		
		
	}

}
