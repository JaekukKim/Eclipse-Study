package ch08.sec08.exam01_method_return;

public class Car {
	int gas; // gas의 변수 선언.

	void setGas(int gas) { // return값이 필요 없는 void 메소드 생성.
		this.gas = gas; // int gas의 값을 gas에 대입. 같은 변수의 이름이지만 다르다는걸 표현해주기 위해 this문 사용.
	} // 리턴갑이 없는 void문이다!!!!

	boolean isLeftGas() { // return값이 t/f로 들어가는 boolean 관련 메소드 생성.
		if (gas == 0) { // gas==0에 주목해야함!!!
			System.out.println("gas가 남아있지 않습니다.");
			return false; // 가스가 0이라면 false값 리턴
		}

		System.out.println("gas가 아직 남아있습니다.");
		return true; // gas가 0이 아니라면 true값 리턴.
	}

	void run() {

		while (true) { // 위의 boolean메소드에서 환원된 t/f값에 따라 while - if - else 실행.
						// boolean값이 t면 아래 문구 실행
			if (gas > 0) { // gas가 아직 남아있다면, (gas>0)
				System.out.println("계속 달립니다.");
				System.out.println("남아있는 gas의 양 : " + gas);
				gas -= 1; // gas--;랑 동일.
				System.out.println();
			} else { // 그게 아니라면 (gas가 0보다 작을 시.)
				System.out.println("이제 멈춥니다.");
				System.out.println("남아있는 gas의 양 : " + gas);
				return;
			}

		}

	}
}