package Dreamschool.cscourse.chapter04;

public class SuperateNumberTest {

	public static void main(String[] args) {
		
		int s_num = 456;
		
		System.out.println("숫자:" + s_num);
		System.out.println("백의자리 수:" + (s_num / 100));
		System.out.println("십의자리수" + (s_num % 100)/10);
		System.out.println("일의자리 수:" + s_num % 10);
		

	}

}
