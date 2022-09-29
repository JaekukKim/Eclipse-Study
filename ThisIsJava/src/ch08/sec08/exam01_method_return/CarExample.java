package ch08.sec08.exam01_method_return;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		// Car 객체를 이용하기 위해 객체생성 후 myCar변수에 위치저장
		int N = 5;
		myCar.setGas(N);
		//setgas 메소드는 리턴값이 없다!!
		System.out.println(N + "만큼의 가스를 주입합니다.");
		System.out.println();
		// Car객체의 위치가 저장된 myCar는 이제 Car객체와 동일.
		// Car객체의 setGas메소드를 호출하여 5만큼 저장.

		boolean gasState = myCar.isLeftGas();
		// Car객체의 isLeftGas메소드를 출력하여 gas가 남아있는지 확인.
		// 이때 gas가 남아있는지를 보기 위해 gasState 변수를 새로 만들어서
		// isLeftGas 메소드의 위치를 저장.

		if (gasState) {
			// isLeftGas의 메소드가 저장된 gasState변수를 이용하여
			// gas가 남아있는 상태를 점검.

			System.out.println("부릉");
			
			myCar.run();
			// 만약 남아있다면 sysout을 실행하고
			// Car객체의 run 메소드 실행.
			//run 메소드는 리턴값이 없다!! (void)

		}
		if (myCar.isLeftGas() == true) {
			System.out.println("gas가 남아있는 상태입니다.");

		}
		else {
			System.out.println("gas가 전부 사용되었습니다.");
		}
	}

}
