package dreamschool01.cscourse.chapter05;

public class DiceTest {

	public static void main(String[] args) {
		
		int dice = 0;
		for(int i = 1; i <= 6;i++) {
			for(int j = 1; j <= 6; j++) {
				System.out.print(i + "+" + j + "=" + (j + i) +"\t" );
				
				dice += j + i;
			}
			System.out.println();
			
		
		}
		System.out.println(dice);
	}

}
