package ch12.sec10.exam_arrays;

import java.util.Arrays;

public class ArraysCopyExam {
	public static void main(String[] args) {
		char[] arr1 = { 'J', 'A', 'V', 'A' };

		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
//		Arrays.copyOf(원본배열, 복사할 길이) 식으로 사용한다.
		System.out.println("복사된 arr2의 배열 리턴 : " + Arrays.toString(arr2));
//		Arrays.toString(배열변수이름); 메소드는 배열을 []를 이용해서 보기 좋게 리턴시켜준다.
//		주로 배열을 출력할 때는 이쁘게 출력하기 위해 Arrays.toString(배열변수이름); 메소드를 사용한다.

		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
//		Arrays.copyOfRange(복사하고싶은배열, 시작 인덱스, 끝인덱스); 의 방식으로 사용한다.
//		복사는 시작인덱스 ~ (끝인덱스-1)까지 복사가 된다!! 이거 매우 중요
		System.out.println("복사된 arr3의 배열 리턴 : " + Arrays.toString(arr3));

		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
//		System.arraycopy(원본배열,원본배열시작인덱스,타겟배열,타겟배열시작인덱스,복사하고싶은 길이);
//		식으로 사용이 된다. 단, 이 메소드는 단순 복사가 아닌 타겟배열의 시작인덱스로부터 붙여넣기 하는 방식이다.
		System.out.println("복사된 arr4의 배열 리턴 : " + Arrays.toString(arr4));

		for (int i = 0; i < arr4.length; i++) {
			// for문으로 원시적으로 배열을 읽는 방법도 존재한다. 하지만 위의 정적 메소드를 이용하여 효율적으로 하자
			System.out.println("arr4[" + i + "]=" + arr4[i]);

		}
	}

}
