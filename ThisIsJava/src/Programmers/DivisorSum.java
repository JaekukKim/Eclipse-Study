package Programmers;

public class DivisorSum {
	class Solution {
		
		// 문제 : 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		
		
		public int solution(int n) {
			int answer = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					answer += i;
				}
			}
			return answer;
		}
	}

}
// 약수의 합을 구하는 과정을 풀어냈다. for_method 패키지에 있는 DivisorExam을 먼저 풀어서 그런지 매우 쉽게 풀었다.
// 중간에 컴파일에러 계속나서 왜그러지 하고 봤는데 if문의 조건문에서 n이랑 i를 반대로 적었었다 아 ㅋㅋ 주어진 n값을 i로 나누어야하는건데 말야
