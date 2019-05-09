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
		System.out.println("이름  : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종류 : " + kind);
	}
	
	@Override
	public void hunt() {
		System.out.println("시속" + speed + "로 뛰어!!");
	}
	@Override
	public void run() {
		System.out.println("순록을 잡아요~");
	}
	

}
