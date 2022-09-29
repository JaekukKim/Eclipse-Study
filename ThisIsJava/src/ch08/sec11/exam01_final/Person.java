package ch08.sec11.exam01_final;

public class Person {
	final String nation = "대한민국";
	final String ssn;
	
	String name;
	
	public Person (String ssn, String name) {
		//정적 메소드로 선언한건 클래스 네임으로 반드시 호출해야함.
		
		this.ssn = ssn;
		this.name = name;
	}
	

}
