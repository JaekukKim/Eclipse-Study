package ch07.exam03_polymorphism_important;

public class ComTire1 extends Tire { // 매개값을 받아야하는 생성자가 Tire에 있기때문에 빨간줄뜸
	public ComTire1(String location, int maxRotation) {//이 경우엔 자식 생성자에서 받아야할 매개변수 작성과 (이 줄에)
		super(location, maxRotation); // super();안에도 변수를 반드시 기재해 주어야 한다. 타입과 매개변수는 반드시 같아야한다는 원칙에 의거.
	}
	
	@Override
		public boolean rolling() {
		++accuRotation;

		if (accuRotation < maxRotation) {
			System.out.println(location + " ComTire1의 타이어의 남은 수명 : " + (maxRotation-accuRotation));
			return true;
			
		}
		else {
			System.out.println(location + " ComTire1의 타이어는 더이상 사용할 수 없습니다.");
			return false;
		}
	}

}
