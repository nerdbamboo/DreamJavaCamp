package dreamschool01.cscourse.chapter07;

public class TelevisionTest {

	public static void main(String[] args) {
		Television tv = new Television("INFINIA", 1500000);
		Television tv1 = new Television("XCANVAS", 1000000 , "LCD TV");
		Television tv2 = new Television("CINEMA", 2000000 , "3D TV");
		
		tv.tvOutPut();
		tv1.tvOutPut();
		tv2.tvOutPut();
		System.out.println("가격의 합  : " + (tv.price + tv1.price + tv2.price));
	}

}
