package ch10.sec03.exam02_hashcode;

public class Key {
	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override
	//equals 메소드만 재정의 하는건 논리적 동등을 파악하는데 별로 도움이 되지 않는다.
	public boolean equals(Object obj) {
		if (obj instanceof Key key) {
			System.out.println("boolean-equals-if 출력");
			if (this.number == key.number) {
				return true;
			}

		}
		return false;
	}
	@Override
	//그래서 해쉬코드 메소드까지 오버라이딩 하여 해쉬코드 파악 후 equals로 넘어갈 수 있게 해줘서 완벽하게 파악을 해줘야 한다.
	public int hashCode() {
		System.out.println("해쉬코드 출력");
		return number;
		
	}
}
	

