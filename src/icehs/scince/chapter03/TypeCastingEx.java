package icehs.scince.chapter03;

public class TypeCastingEx {

	public static void main(String[] args) {
		
		long billWealth = 7000000000L;
		System.out.println("������:" + billWealth);
		
		
		
		double doubleBillWeath = billWealth;
		System.out.println("double ������ ��ȯ:" + doubleBillWeath);
		
		int intBillWeath = (int)billWealth;
		System.out.println("int������ ��ȯ�� ��:" + intBillWeath);
	}

}
