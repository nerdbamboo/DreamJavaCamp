package dreamschool01.cscourse.workshop09;

public class Teacher extends Person {
	
	private String subject;
	
	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("수업을 해요.");
		
	}
}	
