package dreamschool01.cscourse.workshop11;

import java.util.ArrayList;

public class StudentListTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("이순신", 80, 90, 95));
		list.add(new Student("강감찬", 95, 89, 92));
		list.add(new Student("김유신", 88, 97, 94));
		
		
		Student stu1 = list.get(0);
		stu1.setEnglish(90);

		list.remove(0);
	
		
		for(Student stu : list) {
			System.out.println(stu.getName() + " (국어 : " + stu.getKorean() + " 영어 : " + stu.getEnglish() + "수학 : " + stu.getMath() + ")" ); 
		}

	}

}
