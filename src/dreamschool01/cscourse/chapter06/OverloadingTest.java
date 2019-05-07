package dreamschool01.cscourse.chapter06;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.addition(1000, 256);
		
		over.addition(3.5, 4.6);
		
		over.addition("mama", "papa");

	}

}
