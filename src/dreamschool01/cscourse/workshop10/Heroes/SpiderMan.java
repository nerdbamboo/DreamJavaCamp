package dreamschool01.cscourse.workshop10.Heroes;

public class SpiderMan extends Hero{
	
	@Override
	public void action() {
		
		
		System.out.print(this.toString());
		fight();
	}
	
	public String toString() { 
		return "스파이더맨";
	}
	

}
