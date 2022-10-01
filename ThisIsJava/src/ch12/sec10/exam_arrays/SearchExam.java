package ch12.sec10.exam_arrays;

import java.util.Arrays;

public class SearchExam {
	public static void main(String[] args) {
		// 배열 내에서 특정값의 인덱스를 찾는 과정이다. 생각보다 중요한 내용임.
		int[] scores = { 9, 1, 5, 3, 7, 6, 2 };
		Arrays.sort(scores); // 검색을 하기 위해선 반드시 정렬을 해야한다.
		// 정렬을 하지 않으면 음수값이 나오는데 음수값은 지금은 나도 모른다. 나중에 추가 할 예정.
		int index = Arrays.binarySearch(scores, 3);
		System.out.println(Arrays.toString(scores));
		System.out.println("3이 속해있는 인덱스는? : " + index);

		System.out.println();

		// 문자열 검색
		String[] names = { "김재국", "이준호", "정의태", "김준걸" };
		Arrays.sort(names);
		int index2 = Arrays.binarySearch(names, "김준걸");
		System.out.println(Arrays.toString(names));
		System.out.println("찾는 값의 인덱스는? : " + index2);

		System.out.println();

		// 객체 검색.
		Member m1 = new Member("정의태");
		Member m2 = new Member("이준호");
		Member m3 = new Member("홍길동");
		Member m4 = new Member("김재국");

		Member[] members = { m1, m2, m3, m4 };

		Arrays.sort(members);
		int index3 = Arrays.binarySearch(members, m4);
		// 여기서 객체 검색할때 다른점이 나온다. (배열,찾는값)에서 찾는값에 문자열을 써주는게 아닌 객체의 변수명을 넣어주어야 한다.
		System.out.println(Arrays.toString(members));
		System.out.println("객체배열중 찾는값이 속해있는 인덱스는? : " + index3);

		// sort와 binarysearch부분은 알고리즘 단골문제이다, 정렬과 이진검색인데 이건 알고리즘 검색하면 많이 나오니
		// 검색하여 참고하도록하자 좀 중요한 알고리즘이니 꼭 찾아보자. 물론 나도.

	}

}
