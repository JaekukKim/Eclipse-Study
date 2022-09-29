package ch10.exam01_equals;

public class Member { //암시적으로 object를 상속받는다 붙이지 않아도 알아서 붙음.
	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
		public boolean equals(Object obj) { // equal메소드를 오버라이딩 하여 **논리적동등의 equal메소드**로 바꿔준다.
			// TODO Auto-generated method stub
			if (obj instanceof Member member) { 
				// instanceof 메소드로 obj가 Member의 객체인지 확인 후 강제 타입 변환, 그리고 member변수에 대입.
				if (id.equals(member.id)) { // 논리적 동등의 equal메소드 오버라이딩 완성. 하지만 equals만 쓰는건 완벽한 파악에 도움이 되지 않는다.
					return true;
				}
			}
			return false;
		}
	
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return id.hashCode(); // 문자열이 같을 경우에는 동일한 해쉬코드 값이 리턴이 된다.
		}

}
