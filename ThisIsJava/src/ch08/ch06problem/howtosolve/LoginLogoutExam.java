package ch08.ch06problem.howtosolve;

public class LoginLogoutExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginLogout log = new LoginLogout();
		
		boolean result = log.login("hong", "12345");
		
		if (result == true) {
			System.out.println("로그인이 되었습니다.");
			log.logout("hong");
		}
		else {
			System.out.println("로그인에 실패하였습니다.");
		}

	}

}
