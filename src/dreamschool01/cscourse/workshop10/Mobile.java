package dreamschool01.cscourse.workshop10;

public class Mobile implements GooglePlay{
	private String production;
	private int price;
	
	
	
	public String getProduction() {
		return production;
	}

	

	public Mobile(String production, int price) {
		
		this.production = production;
		this.price = price;
	}
	
	public void call(int time) {
		System.out.println(production + " : " + time + "�� ��ȭ�߽��ϴ�.");
	}
	public void charge(int time) {
		System.out.println(production + " : " + time + "�� �����߽��ϴ�.");
		
		
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "���� " + price +  "���� �����߽��ϴ�.");
		
	}
	

	
	
}



