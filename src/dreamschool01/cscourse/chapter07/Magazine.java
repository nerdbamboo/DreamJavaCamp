package dreamschool01.cscourse.chapter07;

public class Magazine {
	
	private int price;
	
	private void setPrice(int price) {
		
		this.price = price;

	}
	
	int discountPrice(int rate) {
		return (int)price * (100 - rate) / 100;
	}

}
