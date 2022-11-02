package ch12.free_section.booleanEqual;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// 논리적 동등을 비교하는 boolean 자료형으로 메소드 생성. boolean과 equal();메소드는 논리적 동등을 비교하는 메소드이다.
		if (obj instanceof Member member) { // 논리적 동등은 boolean - equals - if문으로 완성.
			if (id.equals(member.id)) {
				return true;
			}

		}
		return false; // 중괄호 항상 확인.

	}

}
