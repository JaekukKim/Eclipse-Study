package ch15.hash.HashCodeAndObjEquals;

public class Member {
	
	// 이름과 나이를 해쉬코드와 논리적 동등 비교를 통하여 동일할 경우 hashset에 저장하지 않는 코드를 만들어볼려고한다.
	private String name;
	private int age;
	
	// 기본생성자는 만들어두는 습관, 생성자 오버로딩을 할 경우 컴파일러는 기본생성자를 만들어주지 않는다.
	public Member() {
		
	}
	
	// 매개변수를 받는 생성자 생성, 객체가 생성될 때 이름과 나이를 바로 줄려고 함.
	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + age;
		// hashCode()는 hash알고리즘에 의해 생성된 정수값, 자세히는 객체의 내부 주소를 정수로 변환한 것 이므로 int로 반환이 된다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member person) {
			return (person.name.equals(name)) && (person.age==age);
		} else {
		return false;
		}
	// 이제 객체의 "값"을 비교하기 위한 object클래스의 equal 메소드를 오버라이딩 하였다. hashcode 값이 같다면 객체의 값이 같은지를 비교하기 시작한다.
	}

}
