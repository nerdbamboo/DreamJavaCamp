package dreamschool01.cscourse.workshop01;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : "  );
        int ame = getUserInput();
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput() ;
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int cheese = getUserInput();
        
        int ameAmount = ame * 2000 ;
        int latteAmount = latte * 3000 ;
        int bagelAmount = bagel * 1500 ;
        int cheeseAmount = cheese * 500 ;
        int allAmount = ameAmount +  latteAmount + bagelAmount + cheeseAmount;
        
        System.out.println("=========�ݾ�=========");
        System.out.println( "�Ƹ޸�ī��   : "  + ameAmount );
        System.out.println( "ī��� : " + latteAmount );
        System.out.println( "���̱�   :" + bagelAmount);
        System.out.println( "ũ��ġ��  :" + cheeseAmount);
        
        System.out.println("====================");
        System.out.println("�� ���� �ݾ�" + allAmount);
        
        int bonus = 0;
        
        if (allAmount >= 12000) {
        	bonus = allAmount / 100 * 1;
        	
        }else if(allAmount >= 30000) {
        	
        	bonus = allAmount / 100 * 2;
        	
        	
        	
        }
        System.out.println("����Ʈ ����" + bonus);
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
