package dreamschool01.cscourse.workshop09;

public class FundAccount extends Account{
	
	double earningRate;
	
	

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
	}
	
	@Override
	public void openAccount() {
		
		System.out.println("���¸� �����մϴ�.");
		System.out.println("���¹�ȣ : " + this.getNumber());
		System.out.println("������ : " + this.getName());
		System.out.println("�ܾ� : " + this.getBalance() + "��");
		System.out.println("���ͷ� : " + earningRate + "%");
	}


}
