package dreamschool01.cscourse.workshop01.a;



public class VehicleManager {
	Airplane[] airplaneArr;
	Car[] carArr;
	Ship[] shipArr;
	
	public VehicleManager() {
		airplaneArr = new Airplane[2];
		carArr = new Car[3];
		shipArr = new Ship[2];
		
		airplaneArr[0] = new Airplane("보잉747",1300, 300, 4);
		/*
		 * airplaneArr[0].modelName = "보잉747"; airplaneArr[0].maxSpeed = 1300;
		 * airplaneArr[0].numberLimit = 300; airplaneArr[0].numOfEngine = 4;
		 */
		
		airplaneArr[1] = new Airplane("F-15", 1600, 1, 1);
		/*
		 * airplaneArr[1].modelName = "F-15"; airplaneArr[1].maxSpeed = 1600;
		 * airplaneArr[1].numberLimit = 1; airplaneArr[1].numOfEngine = 1;
		 */
		
		carArr[0] = new Car("그랜저", 180, 5, 10);
		/*
		 * carArr[0].modelName = "그랜저"; carArr[0].maxSpeed = 180; carArr[0].numberLimit
		 * = 5; carArr[0].mileage = 10;
		 */
		carArr[1] = new Car("스파크", 130, 4, 15);
		/*
		 * carArr[1].modelName = "스파크"; carArr[1].maxSpeed = 130; carArr[1].numberLimit
		 * = 4; carArr[1].mileage = 15;
		 */
		carArr[2] = new Car("스타렉스", 150, 10, 11);
		/*
		 * carArr[2].modelName = "스타렉스"; carArr[2].maxSpeed = 150; carArr[2].numberLimit
		 * = 10; carArr[2].mileage = 11;
		 */

		shipArr[0] = new Ship("크루즈2", 30, 400, 35000);
		/*
		 * shipArr[0].modelName = "크루즈2"; shipArr[0].maxSpeed = 30;
		 * shipArr[0].numberLimit = 400; shipArr[0].replacement = 35000;
		 */
			
		shipArr[1] = new Ship("노틸러스", 25, 150, 15000);
		/*
		 * shipArr[1].modelName = "노틸러스"; shipArr[1].maxSpeed = 25;
		 * shipArr[1].numberLimit = 150; shipArr[1].replacement = 15000;
		 */
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < airplaneArr.length ; inx++) {
			airplaneArr[inx].displayInfo();
			airplaneArr[inx].available = true;
		}
		
		for (int inx = 0 ; inx < carArr.length ; inx++) {
			carArr[inx].displayInfo();
			carArr[inx].available = true;
		}
		
		for (int inx = 0 ; inx < shipArr.length ; inx++) {
			shipArr[inx].displayInfo();
			shipArr[inx].available = true;
		}
		
		System.out.println();
	}
}

