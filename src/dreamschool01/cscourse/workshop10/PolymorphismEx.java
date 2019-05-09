package dreamschool01.cscourse.workshop10;

public class PolymorphismEx {

	public static void main(String[] args) {
		
		
		Person[] persons = new Person[3];
		persons[0]= new Person("ȫ�浿", "111-222");
		persons[1]= new Student("ȫ���", "34343434", "��ǻ�� ���а�");
		persons[2] = new Teacher("������","232323", "JAVA");
		
		
		for(int i = 0; i < persons.length; i++) {
			persons[i].eat();
			persons[i].sleep();
			System.out.println();
		}
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
		}
		
	
	}

}
