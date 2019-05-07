package dreamschool01.cscourse.chapter05;

public class GuGuDanOddNumberTest {

	public static void main(String[] args) {
		
		for(int j = 1; j <= 9; j++) {
			for(int i = 1; i <= 9; i++ ) {
				if((i * j)%2 != 0) {
					System.out.print(i + " X " + j + " = " + i * j +  "\n");
				}
				
			}
			
		}

	}

}
