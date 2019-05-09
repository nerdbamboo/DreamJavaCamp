 package dreamschool01.cscourse.workshop02;

public class Book {

	String isbn;
	String title;
	String author;
	int price;
	String issueDate;
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author;
		
		
		
	}
	public Book(String isbn, String title, String author, int price) {
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		//this.issueDate = issueDate;
		
	}
	
	
	public Book(String isbn, String title, String author, int price, String issueDate) {
		
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.issueDate = issueDate;
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getIssueDate() {
		return issueDate;
	}
	
	public void printBookInfo() {
		
		if(true) {
			System.out.println("[제목] " + title + " [저자]" + author);
		}
		
		
	}
	
}

