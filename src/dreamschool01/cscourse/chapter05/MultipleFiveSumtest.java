package dreamschool01.cscourse.chapter05;

public class MultipleFiveSumtest {

	public static void main(String[] args) {
		int count = 1;
		int sum = 0;
		
		while(sum < 100) {
			int mulFive = count * 5;
			sum += mulFive;
			System.out.println(count + ", ( +"  + mulFive + ")" + sum);
			if(mulFive > 100) {
				break;
			}
			count++;
		}

	}

}
