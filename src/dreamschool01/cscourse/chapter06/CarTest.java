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
		car.driverCar("IT 센터", "인천공항", 10.17);
		car.printCarInfo();
		car.driverCar("인천공항", "곤지암 리조트", 60.21);
		car.printCarInfo();
		car.possibilty();
		

	}

}
