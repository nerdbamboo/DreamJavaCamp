package dreamschool01.cscourse.workshop02;

import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
	
	

	public static void main(String[] args) {
		
		int comNum = getHiddenNumber();
		int count = 1;
		
		if(checkNumber(comNum)) {
			
			while(checkNumber(comNum)) {
				comNum = getHiddenNumber();
				
			}
			System.out.println(comNum);
			
		} /*
			 * else { System.out.println(comNum); }
			 */
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int myNum = getUserInput();
		
		if(checkNumber(myNum)) {
			
			while(checkNumber(myNum)) {
				System.out.print("��� �ڸ����� �ٸ����� �Է��Ͽ� �ּ���  : ");
				myNum = getUserInput();
				
			}
			System.out.println(myNum);
			
		}
		
		int strike = 0;
		
		int ball = 0;
		
		while(true) {
			
			
			int number1 = comNum / 100;
			int number2 = (comNum % 100 ) / 10;
			int number3 = comNum % 10;
			
			
			int mynum1 = myNum / 100;
			int mynum2 = (myNum % 100 ) / 10;
			int mynum3 = myNum % 10;
			
			
			if(checkNumber(myNum)) {
				
				while(checkNumber(myNum)) {
					System.out.print("��� �ڸ����� �ٸ����� �Է��Ͽ� �ּ���  : ");
					myNum = getUserInput();
					
				}
				System.out.println(myNum);
				
			}
			
			if(number1 == mynum1) {
				strike++;
			}
			if(number2 == mynum2) {
				strike++;
			}
			if(number3 == mynum3) {
				strike++;
			}
			if(number1 == mynum2 || number1 == mynum3){
				ball++;
			}
			if(number2 == mynum1 || number2 == mynum3){
				ball++;
			}
			if(number3 == mynum2 || number3 == mynum1){
				ball++;
			}
			
			System.out.println(strike + "S," + ball + "B");
			
			
			if(myNum == comNum ) {
				System.out.println("�����մϴ�." + count + "�� ���� ���߼̱���");
				break;
			}
			
			System.out.print(" Ʋ�Ƚ��ϴ�. �ٽ� ���ڸ� �Է��ϼ��� : ");
			myNum = getUserInput();
			
	        strike = 0;
			ball = 0;
			
			count++;
		}	
		
		
		//conNum �� myNum�� ��
		//������� --> 1S 2B
		//�¾����� => �����մϴ�.~~~ X �� ���� ����̱���.
		
		
	}	
	public static boolean checkNumber(int number) {
		
		int number1 = number / 100;
		int number2 = (number % 100 ) / 10;
		int number3 = number % 10;
		
		if(number1 == number2 || number2 == number3 || number3 == number1 || number1 == 0) {
			
			return true;
		}else {
			return false;
		}
		
		
	}
	
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(988);
		return num;
	}
	public static int getUserInput() {
        
       	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
