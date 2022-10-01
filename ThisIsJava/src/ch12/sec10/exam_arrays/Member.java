package ch12.sec10.exam_arrays;

public class Member implements Comparable <Member> {
	//메인 메소드가 없는 클래스 객체이다.
	String name;

	public Member(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Member o) {
		// 현재 멤버가 더 적을경우에는 음수값, 현재 멤버와 매개값이 동일한 경우 0, 현재 멤버가 매개값보다 크면 양수값 리턴.
		// 여기선 위에 있는 name으로 비교를 진행할것이다.
		return name.compareTo(o.name);

		// ex) "a".compareTO("b"); a와 b를 비교, a는 b보다 작아서 -1을 리턴한다.
		// 만약 매개값과 같다면, 즉 a자리에 b가온다면 0, a자리에 b보다 큰 알파벳이 온다면 1을 리턴한다.
	}

}
