package dreamschool01.cscourse.chapter06;

public class Car {
	
	String carName;
	int oilAmount;
	double runDistance;
	
	void addOil(int amount) {
		oilAmount += amount;
		System.out.println("휘발유" + amount + "L주유합니다.");
		
		
	}
	void printCarInfo() {
		System.out.println("[" + carName + "]" + "남은 기름양 : " + oilAmount + "L, 총 주행거리  : " + runDistance + "km");
		
	}
	void driverCar(String startPoint, String endPoint, double driveDistance) {
		if((oilAmount -= (driveDistance / (double)20)) < 0) {
			System.out.println("기름이 부족하여 중간에 멈추었습니다.");
		}else {
			System.out.println(startPoint + "에서" + endPoint + "까지" + driveDistance + "km 주행하였습니다.");
		}
		
		
		oilAmount -= (int)(driveDistance / 20);
	}
	void possibilty() {
		System.out.println("주행 가능한 거리는 약" + oilAmount * 20 + "입니다.");
	}
	

}
