package dreamschool01.cscourse.chapter06;

public class Student {
	String name;
	String studentNum;
	double korean;
	double english;
	double math;
	
	double average() {
		double avg = (korean + english + math) / (double)3;
		
		return avg;
	}
	
	void printStudendtInfo() {
		System.out.println("일름  :" + name);
		System.out.println("학번 : " + studentNum);
		System.out.println("국어 점수  :" + korean);
		System.out.println("영어 점수 : " + english);
		System.out.println("수학 점수 : " + math);
		System.out.println("평균 점수 : " + (int)average());
	}
	void chageSutdentID(String newId) {
		studentNum = newId;
	}
	

}
