package icehs.scince.chapter03;

public class StringBariableEx {
	public static void main(String[] args) {
		String name ="홍길동";
		String matheScore = "96";
		int englishScore = 82;
		
		int intMathScore = Integer.parseInt(matheScore);
		
		System.out.println("이름:" + name);
		System.out.println("수학점수:" + matheScore);
		System.out.println("영어점수:" + englishScore);
		System.out.println("------------------------");
		System.out.println(matheScore + englishScore);
		System.out.println(intMathScore + englishScore);
	}

}