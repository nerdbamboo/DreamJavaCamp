package dreamschool01.cscourse.chapter06;

public class ChocolateTest {

	public static void main(String[] args) {
		
		Chocolate choco = new Chocolate();
		
		choco.name = "�Ƹ�����";
		choco.type = "��ũ";
		choco.price = 2200;
		
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		
		choco.printChocolateInfo();
		
		System.out.println("�Ƹ����� ���ݷ� 20�� : " + choco.calculateTotalPrince(20));
		
		choco.changeChocolateInf("ī�� ����", 2500);
		choco.printChocolateInfo();
		
		System.out.println("ī��⸮�� ���ݷ� 15��(10%����)" + choco.calculateTotalPrince(15, 10));
		
		choco.changeChocolateInf("Ʈ���� ���", 2300, "ȭ��Ʈ");
		choco.printChocolateInfo();
		
		/*
		 * int totalPrice = choco.calculateTotalPrince(20, 30);
		 * 
		 * int totalPrice1 = choco.calculateTotalPrince(20);
		 * 
		 * System.out.println(chocoName + "���ݷ� 20�� : " + totalPrice + "hihi" +
		 * totalPrice1); choco.changeChocolateInf("ī�� Ű����", 2500);
		 * choco.changeChocolateInf("ī�� Ű����", 2500, "�� �ϰ�"); choco.printChocolateInfo();
		 */
		

	}

}
