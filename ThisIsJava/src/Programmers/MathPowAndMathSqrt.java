package Programmers;

public class MathPowAndMathSqrt {
	class Solution {
		public long solution(long n) {

//	문제 : 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
//	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

			// Math.pow(n,n2);와 Math.sqrt();를 사용하여야 한다.
			// 참고 : Math.pow(n,n2);에서 n은 특정 수를 말하고 n2는 n의 n2제곱하는걸 의미한다.

			long x = (long) Math.sqrt(n);
			// 양의 정수 x가 n의 제곱근인지 아닌지 판단할라면 간단하게 n에다가 루트를 씌워 줬을때 x랑 같은지 봐야한다.
			
			if (Math.pow(x, 2) == n) {
			// n이 x의 제곱이라면, x+1을 리턴해야한다. if문으로 간단하게.
				return (long) Math.pow(x + 1, 2);
			} else {
				return -1;
			}

		}
	}

}

// (220930) 본격적인 배열 들어가기전 마지막 문제이다. 선행학습으로 정적메소드인 Math메소드 관련해서 알고는 있었으나 정말 어렵게 풀었다.
// 위의 주석은 프로그래머스에서 풀기 전에 적은것이다. 굉장히 뿌듯했던 문제.
