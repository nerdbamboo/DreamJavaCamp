package dreamschool01.cscourse.chapter06;

public class CoffeTest {

	public static void main(String[] args) {
		
		Coffe ame = new Coffe();
		Coffe late = new Coffe();
		Coffe maki = new Coffe();
		
		ame.name = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		late.name = "카페 라테";
		late.price = 4000;
		late.printCoffeeInfo();
		
		maki.name = "마키야또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		System.out.println("총 금액 : " + (ame.price + late.price + maki.price));
		

	}

}
