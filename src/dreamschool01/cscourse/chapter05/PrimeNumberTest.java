package dreamschool01.cscourse.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		int number = 23;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				System.out.println("소수가 아닙니다.");
				break;
			}else {
				System.out.println("소수입니다.");
				
			}
			
		}
		
		
		
	}

}
