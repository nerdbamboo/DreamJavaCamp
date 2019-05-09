package dreamschool01.cscourse.workshop01;

public class Car extends Vehicle {
	
	private int mileage;
	
	
	
	
	public Car(String modelName, int maxSpeed, int numberLimit, boolean available, int mileage) {
		super(modelName, maxSpeed, numberLimit, available);
		this.mileage = mileage;
	}






	public Car(String modelName, int maxSpeed, int numberLimit, int mileage) {
		super(modelName, maxSpeed, numberLimit);
		this.mileage = mileage;
	}
	
	



	public int getMileage() {
		return mileage;
	}






	public void setMileage(int mileage) {
		this.mileage = mileage;
	}





	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
		System.out.println(" 평균연비 : " + mileage + "km/l");
	}
}
