package dreamschool01.cscourse.chapter07;

public class Book {
	String title;
	int price;
	String author;
	
	Book(){
		
	}
	Book(String title, String author){
		
		this.title = title;
		this.author = author;
		
	}
	Book(String myTitle, int newPrice){
		this.title = myTitle;
		this.price = newPrice;
	}
	Book(String title, String author, int price){
		this(title, author);;
		this.title = title;
		this.price = price;
	}
	Book(String author){
		this.author = author;
	}
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}

}
