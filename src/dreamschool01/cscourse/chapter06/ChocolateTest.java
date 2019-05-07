package dreamschool01.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		
		Chocolate choco = new Chocolate();
		
		choco.name = "아마도라";
		choco.type = "다크";
		choco.price = 2200;
		
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		
		choco.printChocolateInfo();
		
		System.out.println("아마도라 초콜렛 20개 : " + choco.calculateTotalPrince(20));
		
		choco.changeChocolateInf("카페 리쉬", 2500);
		choco.printChocolateInfo();
		
		System.out.println("카페기리쉬 초콜렛 15개(10%할인)" + choco.calculateTotalPrince(15, 10));
		
		choco.changeChocolateInf("트리플 블랑", 2300, "화이트");
		choco.printChocolateInfo();
		
		/*
		 * int totalPrice = choco.calculateTotalPrince(20, 30);
		 * 
		 * int totalPrice1 = choco.calculateTotalPrince(20);
		 * 
		 * System.out.println(chocoName + "초콜렛 20개 : " + totalPrice + "hihi" +
		 * totalPrice1); choco.changeChocolateInf("카페 키리쉬", 2500);
		 * choco.changeChocolateInf("카페 키리쉬", 2500, "맨 니가"); choco.printChocolateInfo();
		 */
		

	}

}
