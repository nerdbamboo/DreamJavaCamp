package dreamschool01.cscourse.workshop09;

public class InHerTest {

	public static void main(String[] args) {
		
		
		
		Student stu = new Student("홍길동", "123 - 3456", "컴퓨터 공확과");
		Teacher tea = new Teacher("홍길순 ", "322 -3443", "컴퓨터 공학과");
		Person per = new Person("강감찬", "3435 -3434");
		
		System.out.println("===== Person =====");
		per.sleep();
		per.eat();
		
		System.out.println("===== Student =====");
		stu.study();
		stu.eat();
		
		System.out.println("===== Teacher =====");
		tea.teach();
		tea.eat();
		
		

	}

	

	

}
