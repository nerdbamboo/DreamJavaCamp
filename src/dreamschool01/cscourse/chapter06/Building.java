package dreamschool01.cscourse.chapter06;

public class Building {
	public String name;
	public  String address;
	public int totalFloor;
	
	public void moveElievator() {
		System.out.println("엘리베이터 운행");
	}
	public void chageAddress(String newAddress) {
		address = newAddress;
	}

}
