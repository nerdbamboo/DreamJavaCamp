package Dreamschool.cscourse.chapter04;

public class operatorTest1 {

	public static void main(String[] args) {
		int num = 64;
		
		System.out.println("짝수입니까 : " + (num % 2 == 0));
		System.out.println("3의 배수입니까 : " + (num % 3 == 0));
		System.out.println("2의 배수이면서 7의 배수입니까:?" + (num % 2 ==0 && num % 7 == 0));
		System.out.println("2의 배수이거나 7의 배수입니까?:" + (num% 2 == 0 || num % 7 == 0));

	}

}
