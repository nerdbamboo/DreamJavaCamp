package dreamschool01.cscourse.chapter07;

public class Pruduct {
	
	String name;
	int price;
	int discount;
	public Pruduct() {
	
	}
	public Pruduct(String name, int price) {
		
		this.name = name;
		this.price = price;
	}
	public Pruduct(String name, int price, int discount) {
	
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	
	void pringProductInfo() {
		System.out.println("====" + this.name  + "====");
		System.out.println("정가 : " + this.discount + "원");
		if(this.discount != 0) {
			System.out.println("할인률 : " + this.discount + "원");
			
		}else {
			System.out.println("할인률 : 할인하지 않음");
		}
		
	}
	
	

}
