package dreamschool01.cscourse.chapter05;

public class GuGuBreakTest {

	public static void main(String[] args) {
		
		for(int dan =2; dan <=9; dan++) {
			if (dan == 5) continue;
			for(int i =1; i <= 9; i++) {
				if(i == 5) {
					continue;
				}
				System.out.println(dan + " X " + i  + " = " + dan * i + "\t");
			
				
			}
			
			System.out.println();
		}

	}

}
