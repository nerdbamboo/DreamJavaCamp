package dreamschool01.cscourse.chapter07;

public class Student {
	
	public  static String COURSE = "JAVA";
	
	private String id;
	private String name;	
	
	public static void printTitle() {
		System.out.println("==========");
		System.out.println("학생 정보 출력");
		System.out.println("==========");
		
	}
	public void printStudent() {
		System.out.println("학번 : " + this.id);
		System.out.println("이름 : " + this.name);
	}
}
