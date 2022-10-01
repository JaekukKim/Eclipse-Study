package ch12.sec10.exam_arrays;

import java.util.Arrays;

public class SortExam {
	public static void main(String[] args) {
		int[] scores = { 99, 97, 95, 96, 98 };
		Arrays.sort(scores); // 배열에 주어져 있는 값을 올림차순으로 정렬하는 메소드이다.

		// 아까와 마찬가지로 for문으로 원시적으로 배열을 출력하는 방법이당.
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}
		System.out.println();

		String[] names = { "홍길동", "김재국", "이준호", "정의태" };
		Arrays.sort(names);
		System.out.println("ㄱ ㄴ ㄷ 순서대로 이쁘게 정렬한 배열 : " + Arrays.toString(names));
		System.out.println();

		// 이제 사용자 정의 배열 클래스를 정렬해보자!!(Member 클래스 새로 생성)
		Member m1 = new Member("정의태");
		Member m2 = new Member("이준호");
		Member m3 = new Member("홍길동");
		Member m4 = new Member("김재국");

		Member[] members = { m1, m2, m3, m4 };

		Arrays.sort(members);
		System.out.println(Arrays.toString(members));
		// 처음에 해쉬코드 16진수가 출력되는 기이한 현상을 겪고 한참을 고민했다.
		// Member 클래스에서 toString() 메소드를 재정의 하니 해결이 되었다. 대박!

		for (int i = 0; i < members.length; i++) {
			System.out.print("\n" + members[i]);
			// 이렇게 하면 comparable 인터페이스가 필요하다고 에러가 나버린다.
			// 이제 comparable 인터페이스를 만들어서 구현객체를 생성하자.
		}
	}

}
