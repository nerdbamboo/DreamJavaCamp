package dreamschool01.cscourse.workshop10.Heroes;

public class BatMan extends Hero{
	
	
	
	@Override
	public void action() {
		
		System.out.print(this.toString() + "��" );
		swim();
		System.out.print(this.toString());
		fight();
	}
	
	public String toString() { 
		return "��Ʈ��";
	}
	
	

}
