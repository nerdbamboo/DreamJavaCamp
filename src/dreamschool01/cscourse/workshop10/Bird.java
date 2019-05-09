package dreamschool01.cscourse.workshop10;

public class Bird extends Animal implements Flyable{
	
	private String habitat;

	public Bird(String kind, int age, String ahbitat) {
		super(kind, age);
		this.habitat = ahbitat;
	}

	public String getAhbitat() {
		return habitat;
	}

	public void setAhbitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public void Fly() {
		System.out.println("날아간다.");
		
	}

	@Override
	public void spreadWings() {
		System.out.println("날개를 펼친다.");
		
	}
	
	


	

}
