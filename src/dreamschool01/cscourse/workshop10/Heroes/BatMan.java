package dreamschool01.cscourse.workshop10.Heroes;

public class BatMan extends Hero{
	
	
	
	@Override
	public void action() {
		
		System.out.print(this.toString() + "이" );
		swim();
		System.out.print(this.toString());
		fight();
	}
	
	public String toString() { 
		return "배트맨";
	}
	
	

}
