package dreamschool01.cscourse.chapter05;

public class ConditionIfElseIfEx {

	public static void main(String[] args) {
		int age = 10;
		
		if(age >= 19 ) {
			System.out.println("성인입니다.");
			System.out.println("입장하세요");
			
		}
		else if(age >= 13) {
			System.out.println("청소년 입니다.");
			System.out.println("조금더 커서와라");
			
		}
		else {
			System.out.println("어린입니다.");
			System.out.println("나가 놀아라");
			
		}

	}

}
