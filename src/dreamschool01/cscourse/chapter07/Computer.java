package dreamschool01.cscourse.chapter07;

public class Computer {
	String model;
	String osVer;
	int production;
	int sales;
	
	
	
	
	public Computer(String model, String osVer, int production, int sales) {
		
		this.model = model;
		this.osVer = osVer;
		this.production = production;
		this.sales = sales;
	}

	void printIncom() {
		System.out.println("====" + this.model + "("+ this.osVer + ")" + "====");
		System.out.println("»ý»ê : " + this.production + " / " + this.sales);
	}
	

}
