package ch15.hash;

import java.util.HashSet;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		// hashset으로 객체를 저장을 해보자.						
		// 먼저 hashset 컬렉션을 생성해야한다
		
		// Set 컬렉션에 String 타입으로 저장해보려고 한다.
		Set <String> programming = new HashSet<>();
		
		programming.add("JAVA");
		programming.add("JSP");
		programming.add("JS");
		programming.add("HTML");
		programming.add("SPRING");
		programming.add("JAVA");
		
		// 일부러 중복하여 저장된 배열의 길이는 몇일까? 일단, set은 중복저장이 안된다.
		int size = programming.size();
		System.out.println("일부러 중복한 뒤 저장된 배열의 길이는? : " + size); // 5가 나온다 JAVA는 1개로 인식되기 때문.
		
		
	}
}
