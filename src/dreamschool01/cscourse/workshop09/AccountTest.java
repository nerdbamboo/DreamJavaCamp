package dreamschool01.cscourse.workshop09;

public class AccountTest {

	public static void main(String[] args) {
		FundAccount fa = new FundAccount("111 - 2222","ȫ�浿", 5000000, 4.7);
		FundAccount fa1 = new FundAccount("151 - 2562","ȫ���", 1000000, 2.9);
		
	
		
		
		fa.openAccount();
		fa.Money();
		
		System.out.println();

		fa1.openAccount();
		fa1.Money();

	}

}
