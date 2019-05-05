package icehs.scince.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		long billWealth = 7000000000L;
		System.out.println("원래값:" + billWealth);
		
		
		
		double doubleBillWeath = billWealth;
		System.out.println("double 형으로 변환:" + doubleBillWeath);
		
		int intBillWeath = (int)billWealth;
		System.out.println("int형으로 변환된 값:" + intBillWeath);
	}

}
