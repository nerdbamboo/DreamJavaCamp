package dreamschool01.cscourse.chapter06;

public class BuildingTest {

	public static void main(String[] args) {
		Building build = new Building();
		build.name = "국제선 타원";
		build.address = "김포동";
		build.totalFloor = 5;
		
		System.out.println("건물명 : " + build.name	);
		System.out.println("주소 : " + build.address);
		System.out.println("층수 : " + build.totalFloor);
		
		build.moveElievator();
		build.chageAddress("비행로");
		
		System.out.println("새 주소 : " + build.address);

	}

}
