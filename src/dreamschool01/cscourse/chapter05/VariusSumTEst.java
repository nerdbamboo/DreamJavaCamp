package dreamschool01.cscourse.chapter05;

public class VariusSumTEst {

	public static void main(String[] args) {
		int sum = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		for(int i = 0; i < 1001; i++) {
			sum += i;
			
			if(i % 2 == 0) {
				evenSum += i;
			}
			else {
				oddSum += i;
				
			}
		}
		
		 
		System.out.println("1���� 1000������ ��" + sum);
		System.out.println("1���� 1000������ ¦������ ��" + evenSum);
		System.out.println("���� 1000������ Ȧ������ ��" + oddSum);
	}

}
