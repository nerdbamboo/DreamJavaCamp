package dreamschool01.cscourse.workshop01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 5.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop05 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double computerScience = getUserInput();
       
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double javaPrograming = getUserInput();
        
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double enginMath = getUserInput();
        
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double opera = getUserInput();
        
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double badminten = getUserInput();
        
        System.out.println( "==============================" );
        double pung = (computerScience + javaPrograming + enginMath + opera + badminten)/5;
        
        System.out.println( "������" + pung +"�� �Դϴ�." );
        double h_min = 2.5;
       
        if(pung >= 3.7 && computerScience >= h_min && javaPrograming >= h_min && enginMath >= h_min && opera >= h_min && badminten >= h_min) {
        	System.out.println("���б� �ޱ� �԰���");
        }
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
