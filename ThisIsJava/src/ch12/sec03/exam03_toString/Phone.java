package ch12.sec03.exam03_toString;

public class Phone {
	private String company;
	private String os;
	
	public Phone(String company, String os) {
		this.company=company;
		this.os=os;
	}
	
	@Override
	public String toString() {
		return company + " , " + os;
		
	}
}
