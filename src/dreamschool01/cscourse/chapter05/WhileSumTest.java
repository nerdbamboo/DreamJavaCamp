package dreamschool01.cscourse.chapter05;

public class WhileSumTest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		while(sum <=50) {
			sum += count;
			
			if(sum >= 50) {
				break;
			}
			count++;
		}
		
		System.out.println("Ƚ�� : " + count);
		System.out.println("�հ� : " + sum );
	}
	

}
