package dreamschool01.cscourse.workshop10;

public class AccountTest {

	public static void main(String[] args) {
		
		Account [] account = new FundAccount[3];
		
		account[0] = new Account("1313 - 445566", "����ġ", 100000);
		account[1] = new FundAccount("111 - 2222","ȫ�浿", 5000000, 4.7);
		account[2]= new FundAccount("151 - 2562","ȫ���", 1000000, 2.9);
		
	
		account[0].openAccount();
		System.out.println();
		((FundAccount)account[1]).openAccount();
		System.out.println(account[1]);
		
		System.out.println();

	
	}

}
