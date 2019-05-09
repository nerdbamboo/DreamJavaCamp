package dreamschool01.cscourse.workshop09;

public class Cat extends Animal {
	
	String name;
	
	

	public Cat(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hunt() {
		
		System.out.println("�㸦 �����ž�");
		
	}
	
	public void play() {
		
		System.out.println("��� ���̰� ���ƿ�~");
		
	}
	
	public void printCatInfo() {
		System.out.println("�̸�  : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + kind);
	}
	
	public String toString() {
		return this.name  + "��ä�� ȣ��Ǿ��ןD������";
	}
	
}
