package Dreamschool.cscourse.chapter04;

public class SlaryTest {

	public static void main(String[] args) {
		
		int monthlySalary = 1000000;
		int totalAnnualSalay = monthlySalary * 12;
		int annualSlaryAfterTax = totalAnnualSalay - (totalAnnualSalay / 100 * 10);
		int bonus = 800000;
		
		int bonusAfterTax = bonus - (bonus / 1000 * 55);
		
		System.out.println("연봉:" + totalAnnualSalay);
		System.out.println("세후 연봉:" + annualSlaryAfterTax );
		System.out.println("보너스:" + bonus);
		System.out.println("세후 보너스:" + bonusAfterTax);
		System.out.println("지금액:" + (annualSlaryAfterTax + bonusAfterTax));
		System.out.println(annualSlaryAfterTax + bonusAfterTax);
	}

}
