package dreamschool01.cscourse.workshop08;

public class OddAditionTest {

	public static void main(String[] args) {
		int[] numbers = {10, 21, 33, 42, 51, 64, 79, 80};
		int sum = 0;
		for(int i = 0; i < numbers.length;i++) {
			if(numbers[i] % 2 != 0) {
				System.out.println(numbers[i]);
				sum += numbers[i];
			}
			
		}
		System.out.println(sum);
	}

}
