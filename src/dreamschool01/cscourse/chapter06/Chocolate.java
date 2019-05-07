package dreamschool01.cscourse.chapter06;

public class Chocolate {
	
	String name;
	String type;
	int price;
	
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
		System.out.println("이름 : " + name + ",종류 : " + type + ",가격 : " + price);
	}

}
