package dreamschool01.cscourse.chapter06;

public class CoffeTest {

	public static void main(String[] args) {
		
		Coffe ame = new Coffe();
		Coffe late = new Coffe();
		Coffe maki = new Coffe();
		
		ame.name = "�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		
		late.name = "ī�� ����";
		late.price = 4000;
		late.printCoffeeInfo();
		
		maki.name = "��Ű�߶�";
		maki.price = 4500;
		maki.printCoffeeInfo();
		
		System.out.println("�� �ݾ� : " + (ame.price + late.price + maki.price));
		

	}

}
