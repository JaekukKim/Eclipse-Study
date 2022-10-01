package ch12.sec10;

import java.util.Arrays;

public class EqualsExam {
	public static void main(String[] args) {

		int[][] original = { { 1, 3 }, { 5, 7 } };
//		 다차원배열, 위같은 경우는 1차원 배열 인덱스 0 1이고
//		original[0] = {1,3}/original[1]={5,7}을 의미

		// 얕은 복사(번짓수만 복사됨)로 복사 후 비교
		// 얕은 복사는 번짓수만 복사되어 참조하는 배열은 원본 배열과 같다.(== 원본 배열은 복사가 안된다는 의미)

		System.out.println("[얕은 복사 후 비교]");
		int[][] clone1 = Arrays.copyOf(original, original.length);
		System.out.println("배열 번지 비교 : " + original.equals(clone1));
		// .equals()는 ==(번짓수 비교) 와 동일한 의미
		// 결과는 false이다. original과 clone1의 번짓수는 당연히 다르기 때문.
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, clone1));
		// 얕은 복제를 했을 경우 번짓수는 원본배열과 같다, 복제 된 배열이 원본배열의 번짓수를 "참조" 하기 때문이다.
		// 그러므로 결과값은 true가 나온다 / 깊은 복제와 매우 햇갈리는 부분이고 제일 중요한 부분이다.
		System.out.println("중첩 배열 항목 값 비교 : " + Arrays.deepEquals(original, clone1));
		// 중첩이 되어있는 항목까지도 비교를 하는게 deepequals이다. 결과값은 당연하게도 true

		// 깊은 복사 후 비교
		System.out.println("\n[깊은 복사 후 비교]");
		int[][] clone2 = Arrays.copyOf(original, original.length);
		clone2[0] = Arrays.copyOf(original[0], original[0].length);
		clone2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : " + original.equals(clone2));
		// .equals()는 ==(번짓수 비교) 와 동일한 의미
		// 결과는 false이다. original과 clone1의 번짓수는 당연히 다르기 때문.
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, clone2));
		// 깊은 복제를 했을 경우 항목 값은 같겠지만 "아예 다른 번짓수를 창조하는" 복제라 얕은복제와는 달리 번짓수가 다르므로
		// false가 나온다. / 깊은복제는 복제 된 모든 항목 자체가 원본과 전부 번짓수가 다르다!!! 헐.
		// 1차배열의 값을 비교한다.
		System.out.println("중첩 배열 항목 값 비교 : " + Arrays.deepEquals(original, clone2));
		// 위와 같이 깊은 비교는 내부 데이터 값 자체를 비교하기때문에 true가 뜬다.
		// 2차배열의 값을 비교한다.

		// 변수명.equals(변수명2)와 Arrays.equals(배열,배열2)는 겉으론 같아보여도 개념자체는 완벽하게 다르다.
	}

}
