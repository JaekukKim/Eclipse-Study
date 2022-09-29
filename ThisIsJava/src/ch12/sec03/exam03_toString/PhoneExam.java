package ch12.sec03.exam03_toString;

public class PhoneExam {
	public static void main(String[] args) {
		Phone ph = new Phone("애플" , "ios");
		
		String str = ph.toString();
		System.out.println(str); //
		
		System.out.println(ph); // sysout메소드 내에 클래스가 객체로 있으면 toString();메소드가 출력된다.
	}

}
