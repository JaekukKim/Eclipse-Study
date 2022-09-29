package ch12.sec03.exam03_toString;

import java.util.Date; // 데이트는 유틸이므로 임포트를 반드시 해줘야함

public class ToStringExam {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
	
	
}
