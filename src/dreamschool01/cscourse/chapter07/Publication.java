package dreamschool01.cscourse.chapter07;

public class Publication {
	
	private String title;
	private int price;
	private int page;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		if(price < 0) {
			System.out.println("[애러] 가격은 음수를 입력할 수 없습니다.");
		}else {
			this.price = price;
		}
		
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		
		if(price < 0) {
			System.out.println("[애러] 패이지는 가격 음수를 입력할 수 없습니다.");
		}else {
			this.page = page;
		}
		
	}
	
	
	
	

	
	
}
