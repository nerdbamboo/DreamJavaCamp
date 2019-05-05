package icehs.scince.chapter03;

public class StaticCastingTest {

	public static void main(String[] args) {
		double lotto = 0.00000012345;
		long papulations = 6974738433L;
		System.out.println("로또에 당첨될 확률:" + lotto);
		System.out.println("세계 인구수:" + papulations);
		
		int intLotto = (int)lotto;
		int intpapulations = (int)papulations;
		System.out.println("int 형 로또에 당첨될 확률:" + intLotto);
		System.out.println("int 형 세계 인구	" + intpapulations);
	}

}
