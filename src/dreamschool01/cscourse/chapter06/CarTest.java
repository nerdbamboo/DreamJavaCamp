package dreamschool01.cscourse.chapter06;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.carName = "BMW";
		car.oilAmount = 5;
		car.runDistance = 140.0;
		
		car.printCarInfo();
		car.addOil(10);
		car.printCarInfo();
		car.driverCar("IT ����", "��õ����", 10.17);
		car.printCarInfo();
		car.driverCar("��õ����", "������ ����Ʈ", 60.21);
		car.printCarInfo();
		car.possibilty();
		

	}

}
