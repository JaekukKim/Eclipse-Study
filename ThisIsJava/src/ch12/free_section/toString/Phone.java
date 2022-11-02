package ch12.free_section.toString;

public class Phone {
	private String company;
	private String os;
	
	public Phone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	//메소드 오버라이딩, toString 메소드를 오버라딩하여 company변수와 os 변수만 출력하도록 한다.
	@Override
	public String toString() {
		return company + " , " + os;
		
	}

}
