package dreamschool01.cscourse.workshop10;

public class PolymorphismEx {

	public static void main(String[] args) {
		
		
		Person[] persons = new Person[3];
		persons[0]= new Person("홍길동", "111-222");
		persons[1]= new Student("홍길순", "34343434", "컴퓨터 공학과");
		persons[2] = new Teacher("강감찬","232323", "JAVA");
		
		
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
