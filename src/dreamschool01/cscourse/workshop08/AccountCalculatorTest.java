package dreamschool01.cscourse.workshop08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		
		AccountCalculator[] arrAcc = {new AccountCalculator("111 - 222 - 5551", 10000 , 4.5),
									  new AccountCalculator("111 - 222 - 5552", 20000 , 4.5),
									  new AccountCalculator("111 - 222 - 5553", 30000 , 4.5),
									  new AccountCalculator("111 - 222 - 5554", 40000 , 4.5),
									  new AccountCalculator("111 - 222 - 5555", 50000 , 4.5)
								
		};
		
		for(int i = 0; i < arrAcc.length; i++) {
			System.out.println("���¹�ȣ : " + arrAcc[i].getNumber() + " / �ܾ�  :" + arrAcc[i].getBalance() +
					" / ���� : " + arrAcc[i].getInterestRate() + "%");
		}
		
		System.out.println("������ �����մϴ�.");
		
		for(int i = 0; i < arrAcc.length;i++) {
			arrAcc[i].setInterestRate(3.7);
			arrAcc[i].calculateInterest();
			System.out.println("���¹�ȣ : " + arrAcc[i].getNumber() + " / ���� : " + arrAcc[i].getInterestRate()
					+ "%" + " / �ܾ�  :" + arrAcc[i].getBalance());
		}
		}

	}


