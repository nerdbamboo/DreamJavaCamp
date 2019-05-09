package dreamschool01.cscourse.workshop10.Heroes;

public class SuperMan extends Hero{
	
	@Override
	public void action() {
		
		System.out.print(this.toString() + "¿Ã" );
		swim();
		System.out.print(this.toString());
		fight();
		System.out.print(this.toString());
		fly();
		
	}
	
	public String toString() { 
		return "Ω¥∆€∏«";
	}
	

}
