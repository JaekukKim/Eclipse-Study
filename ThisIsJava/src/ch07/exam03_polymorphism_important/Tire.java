package ch07.exam03_polymorphism_important;

public class Tire {
	// 필드 선언
	public int maxRotation; // 최대 회전수 저장 필드 선언
	public int accuRotation; // 누적 회전수 저장 필드 선언
	public String location; // 타이어의 위치 저장 필드 선언

	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;

	}

	public boolean rolling() { // 리턴값을 t/f로 반드시 환원, 아래 쓴 if문같은경우는 t/f확실하게.
		++accuRotation;

		if (accuRotation < maxRotation) {
			System.out.println(location + " 위치에 있는 타이어의 남은 수명 : " + (maxRotation-accuRotation));
			return true;
			
		}
		else {
			System.out.println(location + " 타이어를 더이상 사용할 수 없습니다.");
			return false;
		}
			
	}

}
