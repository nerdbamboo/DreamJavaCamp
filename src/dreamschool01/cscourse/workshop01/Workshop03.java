package dreamschool01.cscourse.workshop01;

//���� 3.
//�� ���� �ֻ����� ������ ��,
//���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Workshop03 {
 
	public static void main( String[] args ) {
		int dice = 0;
		for(int i = 1; i <= 6;i++) {
			for(int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.print(i + "+" + j + "=" + (j + i) +"\t" );
				}
				
				
				dice += j + i;
			}
			System.out.println();
			
		
		}
		
	
     
     
 	}
}