package icehs.scince.chapter03;

public class StringBariableEx {
	public static void main(String[] args) {
		String name ="ȫ�浿";
		String matheScore = "96";
		int englishScore = 82;
		
		int intMathScore = Integer.parseInt(matheScore);
		
		System.out.println("�̸�:" + name);
		System.out.println("��������:" + matheScore);
		System.out.println("��������:" + englishScore);
		System.out.println("------------------------");
		System.out.println(matheScore + englishScore);
		System.out.println(intMathScore + englishScore);
	}

}