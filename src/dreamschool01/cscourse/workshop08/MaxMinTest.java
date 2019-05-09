package dreamschool01.cscourse.workshop08;

public class MaxMinTest {

	public static void main(String[] args) {
		int[] num = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int max = num[0];
		int min = num[0];
		
		
		for(int i = 0; i < num.length; i++) {
			
			if(num[i] >max ) {
				max = num[i];
				
			}
			if(num[i] < min ) {
				min = num[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
