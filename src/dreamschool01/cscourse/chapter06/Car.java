package dreamschool01.cscourse.chapter06;

public class Car {
	
	String carName;
	int oilAmount;
	double runDistance;
	
	void addOil(int amount) {
		oilAmount += amount;
		System.out.println("�ֹ���" + amount + "L�����մϴ�.");
		
		
	}
	void printCarInfo() {
		System.out.println("[" + carName + "]" + "���� �⸧�� : " + oilAmount + "L, �� ����Ÿ�  : " + runDistance + "km");
		
	}
	void driverCar(String startPoint, String endPoint, double driveDistance) {
		if((oilAmount -= (driveDistance / (double)20)) < 0) {
			System.out.println("�⸧�� �����Ͽ� �߰��� ���߾����ϴ�.");
		}else {
			System.out.println(startPoint + "����" + endPoint + "����" + driveDistance + "km �����Ͽ����ϴ�.");
		}
		
		
		oilAmount -= (int)(driveDistance / 20);
	}
	void possibilty() {
		System.out.println("���� ������ �Ÿ��� ��" + oilAmount * 20 + "�Դϴ�.");
	}
	

}
