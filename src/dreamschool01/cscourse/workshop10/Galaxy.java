package dreamschool01.cscourse.workshop10;

public class Galaxy extends Mobile{
	
	private String osVersion;
	

	public Galaxy(String production, int price) {
		super(production, price);
		
	}
	
	@Override
	public void charge(int time) {
		System.out.println("Galaxy : " + time + "분 충전하면 펑!!!");
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	

}
