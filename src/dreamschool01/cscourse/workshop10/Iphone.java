package dreamschool01.cscourse.workshop10;


public class Iphone extends Mobile{
	
	private String colour;

	public Iphone(String production, int price) {
		super(production, price);
		this.colour = colour;
		
	}
	
	@Override
	public void charge(int time) {
		System.out.println("IPhone : " + time + "�� �����߽��ϴ� Full!!!");

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
	
}
