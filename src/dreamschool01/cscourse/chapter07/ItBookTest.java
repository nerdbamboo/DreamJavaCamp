package dreamschool01.cscourse.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		
		ItBook sQLbook = new ItBook();
		ItBook java = new ItBook();
		ItBook jsp = new ItBook();
		
		sQLbook.setPrice(50000);
		sQLbook.setTitle("SQL Plus");
		sQLbook.setDiscountRate(5.5);
		
		java.setDiscountRate(3.2);
		java.setPrice(28000);
		java.setTitle("Java 2.0");
		
		jsp.setDiscountRate(6.9);
		jsp.setPrice(37000);
		jsp.setTitle("JSP Servlet");
		
		sQLbook.printItBook();
		java.printItBook();
		jsp.printItBook();
		
		System.out.println();
		System.out.println("SQL Plus �� ������ ���η��� �����մϴ�.");
		sQLbook.setPrice(55000);
		sQLbook.setDiscountRate(9.5);
		sQLbook.printItBook();
		System.out.println("JAVA 2.0�� ������ �����մϴ�.");
		java.setPrice(33000);
		java.printItBook();
		
		System.out.println("JSP Servelt �� ����� ���η��� �����մϴ�.");
		jsp.setTitle("Servelt & JSP");
		jsp.setDiscountRate(12.6);
		jsp.printItBook();
		
		System.out.println();

	}

}
