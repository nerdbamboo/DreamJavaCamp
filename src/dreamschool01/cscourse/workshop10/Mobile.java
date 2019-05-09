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
		System.out.println(production + " : " + time + "분 통화했습니다.");
	}
	public void charge(int time) {
		System.out.println(production + " : " + time + "분 충전했습니다.");
		
		
	}

	@Override
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "앱을 " + price +  "원에 구입했습니다.");
		
	}
	

	
	
}



