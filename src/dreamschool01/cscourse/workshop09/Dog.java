package dreamschool01.cscourse.workshop09;

public class Dog extends Animal {
	
	private String name;
	private int speed;

	public Dog(int age,String name, String kind, int speed) {
		super(age, kind);
		this.name = name;
		this.speed = speed;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void printDogInfo() {
		System.out.println("�̸�  : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + kind);
	}
	
	@Override
	public void hunt() {
		System.out.println("�ü�" + speed + "�� �پ�!!");
	}
	@Override
	public void run() {
		System.out.println("������ ��ƿ�~");
	}
	

}
