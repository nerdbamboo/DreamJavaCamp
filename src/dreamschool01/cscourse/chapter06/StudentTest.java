package dreamschool01.cscourse.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "Me";
		stu.studentNum = "S001";
		stu.korean = 94;
		stu.english = 80;
		stu.math = 89;
		
		stu.printStudendtInfo();
		System.out.println("* �й��� �����մϴ�.");
		stu.chageSutdentID("STU0001");
		stu.printStudendtInfo();
	}

}
