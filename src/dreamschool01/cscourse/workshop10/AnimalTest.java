package dreamschool01.cscourse.workshop10;

public class AnimalTest {

	public static void main(String[] args) {
		Animal bird1 = new Bird("������ ", 2, "�������");
		
		System.out.println(bird1.getKind() + "(" + bird1.getAge() + "�� : " + ((Bird)bird1).getAhbitat());
		
		
		((Bird)bird1).spreadWings();
		((Bird)bird1).Fly();
		
		Flyable bird2 = new Bird("������ ", 2, "�������");
		
		System.out.println(((Bird)bird2).getKind() + "(" + ((Bird)bird2).getAge() + "�� : " + ((Bird)bird2).getAhbitat());
		
		
		bird2.spreadWings();
		bird2.Fly();
		
		
	}
	
	

}
