package dreamschool01.cscourse.chapter05;

public class NumberChecktest {

	public static void main(String[] args) {
		int firstNum = 2 * 3;
		if (firstNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
			
		}else if (firstNum < 10) {
			System.out.println("한자리 수 입니다.");
		}else if ( firstNum < 100) {
			System.out.println("두자리 수 입니다.");
		}else {
			System.out.println("세자리 수 입니다.");		
		}
		
		firstNum = 4 * 5;
		
		if (firstNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
			
		}else if (firstNum < 10) {
			System.out.println("한자리 수 입니다.");
		}else if ( firstNum < 100) {
			System.out.println("두자리 수 입니다.");
		}else {
			System.out.println("세자리 수 입니다.");		
		}
		
		firstNum = 23 * 96;
		
		if (firstNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
			
		}else if (firstNum < 10) {
			System.out.println("한자리 수 입니다.");
		}else if ( firstNum < 100) {
			System.out.println("두자리 수 입니다.");
		}else {
			System.out.println("세자리 수 입니다.");		
		}
		
		firstNum = 4 * -3;
		
		if (firstNum < 0) {
			System.out.println("음수를 확인하지 않습니다.");
			
		}else if (firstNum < 10) {
			System.out.println("한자리 수 입니다.");
		}else if ( firstNum < 100) {
			System.out.println("두자리 수 입니다.");
		}else {
			System.out.println("세자리 수 입니다.");		
		}
		
		

	}

}
