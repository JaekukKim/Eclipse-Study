package ch10.sec03.exam02_hashcode;

import java.util.Objects;

public class HashCode {
	private int no;
	private String name;
	
	public HashCode(int no, String name) {
		this.no=no;
		this.name=name;
	}
	
	//생성자 매개변수 값에 변화를 주지 않으면서 호출할 수 있게 게터 메소드 사용.
	public int getNo() {
		return no;
		
	}
	public String getName() {
		return name;
	}
	
	@Override
	//Objects.hash 메소드 이다. 입력된 값의 해시코드를 생성해주며 배열타입으로 나열한다.
	public int hashCode() {
		return Objects.hash(no, name);
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof HashCode hs) {
			if ((no==hs.getNo()) & (name.equals(hs.getName()))) {
				return true;
			}
			
		}
		return false;
		
	}

}
