package dreamschool01.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 문제 5.
// A대학의 학기말이 되었다. 각과목별로 성적을 입력 받아 장학금을 받을 학생을 선별하려고 한다.
// 장학금을 받을 수 있는 조건은 아래와 같다.
//   1) 평점이 3.7 이상   2) 각 과목별 성적이 2.5 이상 (한 과목이라도 2.5 미만인 과목이 있다면, 과락으로 장학금 탈락)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science 성적을 입력하세요 : " );
        double computerScience = getUserInput();
       
        System.out.print( "Java Programming 성적을 입력하세요 : " );
        double javaPrograming = getUserInput();
        
        System.out.print( "공학수학 성적을 입력하세요 : " );
        double enginMath = getUserInput();
        
        System.out.print( "오페라의 이해 성적을 입력하세요 : " );
        double opera = getUserInput();
        
        System.out.print( "배드민턴 성적을 입력하세요 : " );
        double badminten = getUserInput();
        
        System.out.println( "==============================" );
        double pung = (computerScience + javaPrograming + enginMath + opera + badminten)/5;
        
        System.out.println( "평점은" + pung +"점 입니다." );
        double h_min = 2.5;
       
        if(pung >= 3.7 && computerScience >= h_min && javaPrograming >= h_min && enginMath >= h_min && opera >= h_min && badminten >= h_min) {
        	System.out.println("장학금 받기 쌉가능");
        }
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
