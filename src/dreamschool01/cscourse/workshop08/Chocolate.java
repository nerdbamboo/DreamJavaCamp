package dreamschool01.cscourse.workshop08;

public class Chocolate {
	
	String name;
	String type;
	int price;
	
	Chocolate(String name, String type, int price){
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	int calculateTotalPrince(int count) {
		return count * price;
		
	}
	int calculateTotalPrince(int count, int discount) {
		return count * price * (100 - discount)/ 100;
		
	}
	
	
	void changeChocolateInf(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		
	}
	
	void changeChocolateInf(String newName, int newPrice, String newType) {
		name = newName;
		price = newPrice;
		type = newType;
		
	}
	
	void printChocolateInfo() {
		System.out.println("�̸� : " + name + ",���� : " + type + ",���� : " + price);
	}
	public String getType() {
		return type;
	}
	public int getPrice() {
		return price;
	}

}
