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
		System.out.println("���� : " + this.discount + "��");
		if(this.discount != 0) {
			System.out.println("���η� : " + this.discount + "��");
			
		}else {
			System.out.println("���η� : �������� ����");
		}
		
	}
	
	

}
