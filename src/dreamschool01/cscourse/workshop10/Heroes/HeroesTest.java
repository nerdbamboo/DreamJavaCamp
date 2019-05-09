package dreamschool01.cscourse.workshop10.Heroes;

public class HeroesTest {

	public static void main(String[] args) {
		
		Hero[] heros = {
				new SuperMan(), new BatMan(), new SpiderMan()
				
		};
		
		System.out.println("Hero ¸ñ·Ï : " + heros[0] + ", " + heros[1] + ", " + heros[2]);
		
		for(Hero h : heros) {
			
			h.action();
			
		}
	}

}
