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
		
		System.out.println("쥐를 잡을거야");
		
	}
	
	public void play() {
		
		System.out.println("모빌 놀이가 좋아요~");
		
	}
	
	public void printCatInfo() {
		System.out.println("이름  : " + name);
		System.out.println("나이 : " + age);
		System.out.println("종류 : " + kind);
	}
	
	public String toString() {
		return this.name  + "객채가 호출되었네욬ㅋㅋㅋ";
	}
	
}
