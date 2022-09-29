package ch12.sec04.exam01_objects;

import java.util.Objects;

public class NullExam {
	public static void main(String[] args) {
		String str1 = "김재국";
		String str2 = null;
		
		//requireNonNull 메소드는 Null을 요구하지 않는 메소드 라고 생각하면 된다. 즉, Null이면 예외발생 한다는 소리
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			System.out.println(Objects.requireNonNull(str2));
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"이름이 없습니다")); //()->이 부분은 람다식이다.
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(Objects.isNull(str2)); // 매개변수의 값이 null이면 true 리턴한다.
		System.out.println(Objects.isNull(str1)); // 매개변수의 값이 null이면 true 리턴한다. 아니면 false
		System.out.println();
		System.out.println(Objects.nonNull(str2)); // 매개변수의 값이 null이면 false를 리턴한다.
		System.out.println(Objects.nonNull(str1)); // 매개변수의 값이 null이아니면 true 리턴한다.
	}

}
