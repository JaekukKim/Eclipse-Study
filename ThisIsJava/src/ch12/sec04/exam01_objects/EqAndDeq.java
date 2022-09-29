package ch12.sec04.exam01_objects;

import java.util.Objects;

public class EqAndDeq { // EualsAndDeepEquals 라는 뜻임 ㅎ
	public static void main(String[] args) {
		Integer o1 = 1000; //new Integer(1000); 이랑 같음, 자동 박싱이라는 개념으로 포장됨.
		Integer o2 = 1000;
		
		
		//매우매우중요!! equals와 deepequals 메소드는 비교하는 두 값이 null일 경우에는 true를 리턴하는 매우 특이한 구조를 갖고있다!!!
		//둘중 하나만 null이면 false를 리턴한다! 명제대로 생각하다간 좆된다.
		
		//equals 메소드로 두 값을 비교
		System.out.println("equals 메소드");
		System.out.println(Objects.equals(o1, o2));
		// o1.equal(o2) 랑 같다. 안쓰는 이유는 o1.으로 시작을 해버리면 o1을 바꿀수가 없다 하지만 매개변수로 설정해버리면 편하게 바꿀 수 있다.
		// 이것이 바로 유틸리티메소드!!!
		
		System.out.println(Objects.equals(o2, null));
		// 둘중 하나의 값이 null이면 false를 리턴한다.
		System.out.println(Objects.deepEquals(o1, o2));
		//deepequals메소드는 비교할 객체가 둘다 배열이 아닐경우 equals랑 같다.
		System.out.println(); // 개행용
		
		
		//배열로 deepequals메소드를 활용하여보장.
		System.out.println("deepequals 메소드");
		Integer[] arr = {1,3,5,7,9};
		// int배열 = 4바이트 정숫값
		Integer[] arr2 = {1,3,5,7,9};
		// integer 배열 = 인덱스[i]번째의 데이터 값을 갖고있는 integer객체가 배열의 항목으로 됨 매우 중요함.
		System.out.println(Objects.equals(arr, arr2));
		// equals로 비교하면 배열의 주솟값만 비교함. 당연히 arr과 arr2 배열의 주솟값은 다르다!.
		System.out.println(Objects.deepEquals(arr, arr2));
		// ****deepequals 메소드는 배열의 번지가 달라도 배열의 데이터값이 같이면 true를 리턴한다.
		
	}
}
