package ch15.arraylist.exam02;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExam {
	public static void main(String[] args) {
		List <String> list = Arrays.asList("김재국","이준호","정의태");
		
		for (String str : list) {
			System.out.println(str);
		}
		
		List <Integer> list2 = Arrays.asList(1,2,3);
		// 원래는 괄호 안에 new Integer(1), new Integer(2), new Integer(3) 으로 주는게 정석이다.
		// 하지만 자동박싱을 이용하여 저렇게 저장해도 된다.
		
		for (Integer inte : list2) {
			// 여기도 저 위에 표기 방식이 정석이나, int를 넣어도 상관이 없다. 당연하게도 자동 언박싱 때문.
			System.out.println(inte);
		}
		
	}

}
