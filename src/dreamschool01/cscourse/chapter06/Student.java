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
		System.out.println("�ϸ�  :" + name);
		System.out.println("�й� : " + studentNum);
		System.out.println("���� ����  :" + korean);
		System.out.println("���� ���� : " + english);
		System.out.println("���� ���� : " + math);
		System.out.println("��� ���� : " + (int)average());
	}
	void chageSutdentID(String newId) {
		studentNum = newId;
	}
	

}
