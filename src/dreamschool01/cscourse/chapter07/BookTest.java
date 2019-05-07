package dreamschool01.cscourse.chapter07;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book("해리포터", 8000);
		
		book1.printBookInfo();
		book2.printBookInfo();

	}

}
