package Programmers;

public class EachPlusFromProg {
	public class Solution {
		public int solution(int n) {
			
	// 문제 : 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	//				예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
			
			int sum = 0; // 자릿수를 저장 할 변수
			while (n >= 1) {
				
				sum = sum + n % 10;
				//각 자릿수를 먼저 한단계씩 구해주어야 한다. 일단 주어진 변수를 10으로 나누면 1의자리는 그대로 나오기 떄문에
				//1의자리는 쉽게 구할 수 있다. 첫번째 루프가 돌면 sum에는 1의자리가 먼저 저장된다.

				n = n / 10;
				//그리고 주어진 변수를 10으로 나눈 "몫"을 구한다면 1의 자리는 0이 되어버린다. 이 상태에서 계속 루프를 돌린다면
				//자연스럽게 각 자릿수는 sum에 계속 더해져 나갈것이다.
			}
			System.out.println("각 자릿수의 합은? : " + sum);

			return sum;
		}
	}

}
// 내가 이런 알고리즘 문제에 굉장히 약하다는걸 다시한번 상기시켜준 문제이다. 분명 for_method 패키지 내에 있는 EachPlus에서
// 풀어봤던건데 같은답이고 다시 풀려고하니 생각조차 안나서 한참을 고민했다. 이부분은 트레이닝이 좀 필요할듯.