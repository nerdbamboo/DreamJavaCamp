package dreamschool01.cscourse.workshop09;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat(3, "�߿���", "�丣�þ�");
		Dog dog = new Dog(2, "�۸��� " , "�ú����� �㽺Ű" , 40);
		
		
		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		System.out.println(cat.toString());
		
		dog.printDogInfo();
		dog.run();
		dog.hunt();

	}

}
