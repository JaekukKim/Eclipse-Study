package ch11.sec07.user_define_exeption;

public class AccountExam {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		//입금하기
		ac.deposit(10000);
		System.out.println("현재 금액은? : " + ac.getBalance()); //현재 금액 출력.
		
		//출금하기
		try {
			ac.draw(30000);
			System.out.println("출금 후 금액은? : " + ac.getBalance()); // 예외가 발생하지 않았으면 여기 실행.
		} catch (BalanceException e) {
			// TODO Auto-generated catch block
			String message = e.getMessage(); // 엄청나게 많이 사용하는 예외는 이것. DB에서는 번호로뜸.
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
			// 개발할때만 정확한 위치를 찾기위해 사용하며 테스트가 끝난 뒤에는 주석처리를 해주자 꼭.
			/*
			 * // ch11.sec07.user_define_exeption.BalanceException: 계좌의 잔고보다 출금하려는 금액이 더
			 * 많습니다. // 20000원 만큼 모자합니다. // at
			 * ch11.sec07.user_define_exeption.Account.draw(Account.java:20) // // at
			 * ch11.sec07.user_define_exeption.AccountExam.main(AccountExam.java:15)
			 */ //이런식으로 적나라하게 뜬다.
			System.out.println();
			System.out.println(e.toString()); // 예외처리 된 곳을 간단하게 하기 위해 사용한다. 이것도 개발자용.
		}
		

	}

}
