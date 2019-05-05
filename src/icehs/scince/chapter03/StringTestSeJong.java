package icehs.scince.chapter03;

public class StringTestSeJong {

	public static void main(String[] args) {
		
		String name = "¼¼Á¾´ë¿Õ";
		String value = "10000";
		int year = 2019;
		
		int thisyear = 2019;
		int intTenThousand = Integer.parseInt(value);
		
		String yesno = "true";
		boolean boolYesNO = Boolean.parseBoolean(yesno);
		
		
		
		
		System.out.println(name + ":" + value);
		System.out.println(year + "³â");
		System.out.println(value + thisyear);
		System.out.println(thisyear + intTenThousand);
		
		System.out.println(boolYesNO);
		System.out.println(!boolYesNO);
	}
	

}
