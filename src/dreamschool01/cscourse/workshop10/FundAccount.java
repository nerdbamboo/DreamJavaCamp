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
		
		System.out.println("수익이 발생했습니다.");
		sum = (int)(getBalance() * earningRate) ;
	}
	
	@Override
	public void openAccount() {
		
		
		System.out.println("펀드 계좌번호 : " + this.getNumber());
		System.out.println("예금주 : " + this.getName());
		System.out.println("잔액 : " + this.getBalance() + "원");
		System.out.println("수익률 : " + earningRate + "%" + "( 원금 : " + sum +"");
	}


}
