package ch08.ch06problem.howtosolve;

public class LoginLogout {
	String name;
	String id;
	String password;
	//인스턴스 필드 선언

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		else {
			return false;
		}
		//boolean으로 login메소드 생성. if문으로 진위여부 판별
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
