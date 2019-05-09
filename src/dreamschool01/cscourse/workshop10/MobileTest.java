package dreamschool01.cscourse.workshop10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile [] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy("Galaxy",0);
		mobiles[1] = new Iphone("IPhone",0);
		Galaxy gal = (Galaxy)mobiles[0];
		Iphone ipn = (Iphone)mobiles[1];
		gal.setOsVersion("안드로이드 오래오");
		ipn.setColour("흰색");
		System.out.println("Galaxy : " + gal.getOsVersion());
		
		mobiles[0].call(5);
		mobiles[0].charge(30);
		System.out.println();
		System.out.println("IPhone : " + ipn.getColour());
		
		mobiles[1].call(10);
		mobiles[1].charge(15);

	}

}
