package Dreamschool.cscourse.chapter04;

public class SlaryTest {

	public static void main(String[] args) {
		
		int monthlySalary = 1000000;
		int totalAnnualSalay = monthlySalary * 12;
		int annualSlaryAfterTax = totalAnnualSalay - (totalAnnualSalay / 100 * 10);
		int bonus = 800000;
		
		int bonusAfterTax = bonus - (bonus / 1000 * 55);
		
		System.out.println("����:" + totalAnnualSalay);
		System.out.println("���� ����:" + annualSlaryAfterTax );
		System.out.println("���ʽ�:" + bonus);
		System.out.println("���� ���ʽ�:" + bonusAfterTax);
		System.out.println("���ݾ�:" + (annualSlaryAfterTax + bonusAfterTax));
		System.out.println(annualSlaryAfterTax + bonusAfterTax);
	}

}
