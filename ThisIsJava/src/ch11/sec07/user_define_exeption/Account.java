package ch11.sec07.user_define_exeption;

public class Account {
	private long Balance;
	
	public Account() {
		
	}
	
	public long getBalance() {
		return Balance;
	}
	
	public void deposit (int money) {
		Balance += money;
	}
	
	public void draw(int money) throws BalanceException { // draw == 출금
		if(Balance < money) {
			throw new BalanceException("계좌의 잔고보다 출금하려는 금액이 더 많습니다.\n" + (money-Balance) + "원 만큼 모자합니다.");
		}
		Balance -= money;
	}

}
