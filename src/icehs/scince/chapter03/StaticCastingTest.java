package icehs.scince.chapter03;

public class StaticCastingTest {

	public static void main(String[] args) {
		double lotto = 0.00000012345;
		long papulations = 6974738433L;
		System.out.println("�ζǿ� ��÷�� Ȯ��:" + lotto);
		System.out.println("���� �α���:" + papulations);
		
		int intLotto = (int)lotto;
		int intpapulations = (int)papulations;
		System.out.println("int �� �ζǿ� ��÷�� Ȯ��:" + intLotto);
		System.out.println("int �� ���� �α�	" + intpapulations);
	}

}
