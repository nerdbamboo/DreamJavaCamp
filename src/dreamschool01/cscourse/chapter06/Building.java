package dreamschool01.cscourse.chapter06;

public class Building {
	String name;
	String address;
	int totalFloor;
	
	public void moveElievator() {
		System.out.println("엘리베이터 운행");
	}
	public void chageAddress(String newAddress) {
		address = newAddress;
	}

}
