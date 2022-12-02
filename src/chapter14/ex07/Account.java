package chapter14.ex07;
class BalanceException extends Exception{
	public BalanceException () {
		super();
	}
	public BalanceException (String message) {
		super(message);
	}

}

public class Account {
	private long balance=1000;	//예금의 잔고
	public Account() {}		//기본 생성자
	
	public long getBalance() {		//getter : 호출시 balance 필드의 값을 리턴으로 돌려줌
		return balance;
	}
	
	//출금 : 
	public void deposit(int money) {	//기존의 잔고에서 money 를 인풋받아서 더해서 다시 필드에 적용
		balance += money;
	}
	
	// 예외처리 
	// 출금
	public void withdorw(int money) throws BalanceException {
		//잔고가 money 보다 작은 경우 잔고 부족이라고 강제로 예외를 발생시켜서
			//예외 메세지 :잔고가 부족합니다. 라고 출력을 해주면 됨
			//Balance Exception<===사용자 정의 예외를 생성해서
		if (money> balance) {
			throw new BalanceException ("잔고가 부족합니다.");
		}else {
			System.out.println(balance -= money);
		}
	}
	public static void main(String[]args) {
	
		Account a1 = new Account();
		try {
			a1.withdorw(900);
		} catch (BalanceException e) {
			e.printStackTrace();
		}
		
	}	
}
