package dreamschool01.cscourse.workshop10;

public class AccountTest {

	public static void main(String[] args) {
		
		Account [] account = new FundAccount[3];
		
		account[0] = new Account("1313 - 445566", "Àü¿ìÄ¡", 100000);
		account[1] = new FundAccount("111 - 2222","È«±æµ¿", 5000000, 4.7);
		account[2]= new FundAccount("151 - 2562","È«±æ¼ø", 1000000, 2.9);
		
	
		account[0].openAccount();
		System.out.println();
		((FundAccount)account[1]).openAccount();
		System.out.println(account[1]);
		
		System.out.println();

	
	}

}
