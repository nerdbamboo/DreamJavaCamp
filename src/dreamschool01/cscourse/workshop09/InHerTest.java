package dreamschool01.cscourse.workshop09;

public class InHerTest {

	public static void main(String[] args) {
		
		
		
		Student stu = new Student("ȫ�浿", "123 - 3456", "��ǻ�� ��Ȯ��");
		Teacher tea = new Teacher("ȫ��� ", "322 -3443", "��ǻ�� ���а�");
		Person per = new Person("������", "3435 -3434");
		
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
