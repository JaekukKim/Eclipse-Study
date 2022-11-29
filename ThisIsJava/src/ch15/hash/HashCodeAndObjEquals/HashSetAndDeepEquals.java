package ch15.hash.HashCodeAndObjEquals;

import java.util.HashSet;
import java.util.Set;

public class HashSetAndDeepEquals {
	public static void main(String[] args) {
		Set<Member> memberList = new HashSet<>();
		
		memberList.add(new Member("재국", 30));
		memberList.add(new Member("재국", 30));
		memberList.add(new Member("익명", 25));
		memberList.add(new Member("익명", 25));
		// 같은 이름과 나이를 두번씩 저장하였다. 해쉬코드와 논리적 동등 비교를 통해 완전하게 같은 객체임을 확인한다면 set에는 2개의 객체만 저장이 되어있어야 한다.
		// 4개가 저장이 됬다면 해쉬코드나 "값"이 다르다는 얘기가 된다.
		
		int memberListSize = memberList.size();
		System.out.println("깊은 비교 후 저장된 객체의 숫자는? : " + memberListSize);
		// 2개가 저장이 되었다 컬렉션 프레임워크를 사용할때 있어 깊은비교, 논리적동등 비교는 매우 중요하다.
	}
}
