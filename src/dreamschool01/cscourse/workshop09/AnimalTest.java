package dreamschool01.cscourse.workshop09;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat(3, "具克捞", "其福矫救");
		Dog dog = new Dog(2, "港港捞 " , "矫海府救 倾胶虐" , 40);
		
		
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
