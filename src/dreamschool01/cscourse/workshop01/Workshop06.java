package dreamschool01.cscourse.workshop01;

public class Workshop06 {

	public static void main(String[] args) {
		
		int myDan = 18;
		for(int i = 1; i <= myDan; i++) {
			for(int dan = 2; dan <=9;dan++) {
				if(dan == myDan) {
					System.out.print(dan + " X " + i + " = " + dan  * i + "\t");
					
				}else {
					
					System.out.print(dan + " X " + i + " = " + dan  * i + ",\t");
				}
				
				
			}
			System.out.println();
		}

	}

}
