package dreamschool01.cscourse.chapter07;

public class Student {
	
	public  static String COURSE = "JAVA";
	
	private String id;
	private String name;	
	
	public static void printTitle() {
		System.out.println("==========");
		System.out.println("�л� ���� ���");
		System.out.println("==========");
		
	}
	public void printStudent() {
		System.out.println("�й� : " + this.id);
		System.out.println("�̸� : " + this.name);
	}
}
