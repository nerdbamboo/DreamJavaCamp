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
		System.out.println(" �ִ����� : " + getNumberLimit() + "��");
		System.out.println(" ��տ��� : " + mileage + "km/l");
	}
}
