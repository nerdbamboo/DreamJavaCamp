package dreamschool01.cscourse.workshop01;

//���� 2.
//�Ʒ��� ���� ������ ����Ǿ� ���� ��,
//���� �ڸ��� ����� ������ �ڸ����� 0���� �ٲٴ� ���α׷��� �ϼ��Ͻÿ�.
public class Workshop02 {
 
	public static void main( String[] args ) {
		int number = 456;
		int num1 = number / 100;
		int num2 = (number % 100) / 10;
		int num3 = number % 10;
		
		System.out.println("ó����  :" + number);
		System.out.println("�����ڸ� : "  + num1);
		System.out.println("�����ڸ�  : " + num2);
		System.out.println("�����ڸ�:" + num3);
		
		int result  = number - (number % 100);
		System.out.println(result);
     
     
 	}
}