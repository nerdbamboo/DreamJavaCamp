package dreamschool01.cscourse.workshop09;

public class Dentist extends Dotor {
	
	public Dentist(String name, String department) {
		super(name, "치과");
		
	}
	
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}

}
