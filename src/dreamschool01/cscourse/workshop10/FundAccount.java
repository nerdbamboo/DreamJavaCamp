package dreamschool01.cscourse.workshop10;

public class FundAccount extends Account{
	
	private double earningRate;
	private int sum;
	
	

	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}


	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	public void Money() {
		
		System.out.println("������ �߻��߽��ϴ�.");
		sum = (int)(getBalance() * earningRate) ;
	}
	
	@Override
	public void openAccount() {
		
		
		System.out.println("�ݵ� ���¹�ȣ : " + this.getNumber());
		System.out.println("������ : " + this.getName());
		System.out.println("�ܾ� : " + this.getBalance() + "��");
		System.out.println("���ͷ� : " + earningRate + "%" + "( ���� : " + sum +"");
	}


}
