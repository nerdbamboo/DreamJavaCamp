package dreamschool01.cscourse.chapter05;

public class GradeIfElseIfTESt {

	public static void main(String[] args) {
		int score = 1000;
		
		
		if(score > 100 || score < 0) {
			System.out.println("What the fxxk? \nAre you Kidding?");
		}
		
		else if (score >= 90) {
			System.out.println("A학점 입니다.");
			
		}
		else if(score >= 80) {
			System.out.println("B학점 입니다");
			
		}
		else if(score >= 70) {
			System.out.println("C학점 입니다");
			
		}
		else if(score >= 60) {
			System.out.println("D학점 입니다");
			
		}
		else {
			System.out.println("F학점 입니다");
			
		}



	}

}
