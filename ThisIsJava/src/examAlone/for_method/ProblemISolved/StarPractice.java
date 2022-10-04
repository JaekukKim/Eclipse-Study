package examAlone.for_method.ProblemISolved;

import java.util.Scanner;

public class StarPractice {
	public static void main(String[] args) {
		// 모래시계 만들기
		// 일단 모래시계 모양을 좀 보자

//		*****
//		 ***
//		  *
//		 ***
//		*****
		
		// "줄" 수를 입력하면 출력되게 만들어보자
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		// 윗부분 역 삼각형과 삼각형을 합치면 모래시계 모양이 나온다. 그럼 역 삼각형 모양을 먼저 만들면 어떨까.

//		*****
//		 ***
//		  *

		// 이 부분이다. 5 3 1 순으로 떨어지고 줄 수는 입력값 3줄.. 입력값* 2 - 1의 규칙성이 나온다. = 2*line-1
		// 공백은 첫째줄에 0개, 둘째줄에 1개 셋째줄에 2개. i(줄 수) -1 = 공백의 갯수 이다.
		
		for (int i = 0; i < line; i++) { // 라인 설정
			for (int j = 0; j < i; j++) { // 공백 설정
				System.out.print(" ");
			}
			for (int k = (2 * line - 1); k >= i * 2 + 1; k--) {
				// 별을 먼저 "찍고" 내려가야한다. 그래서 k의 증감식은 --이다.
				// 별의 갯수는 위에서 말했듯이 2*line-1이다. 별의 갯수를 찍고 
				System.out.print("*");
			}
			System.out.println();
		}
		//그리고 아랫부분에 붙을 삼각형을 만들어 주어야 한다.
		
//		 ***
//		*****
		
		//이 부분인데 
		for (int i = 1; i < line; i++) {
			// i가 0인경우 한개짜리 별이 겹친다. 그래서 겹치는걸 방지하기 위해 "2번째줄"부터 시작한다. (0기준) 
			for (int j = line-1; j > i; j--) {
				// 여기선 위와 다르게 공백을 먼저 "찍고" 내려가야한다. j의 증감식은 --
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
