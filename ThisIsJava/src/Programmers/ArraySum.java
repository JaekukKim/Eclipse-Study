package Programmers;

public class ArraySum {
	class Solution {
		public double solution(int[] arr) {
			
		// 문제 : 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

			double answer = 0;
			int sum = 0; // 배열의 데이터값을 저장할 변수 생성.

			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				// 배열의 인덱스0에 저장되어 있는 데이터부터 차례로 데이터값을 더해나감.
			}

			answer = (double) sum / arr.length; // 총 합계 나누기 배열의 길이는 당연하게도 평균값.
			// answer은 이미 double타입이지만 혹시모를 컴파일 에러를 방지하기 위한 강제캐스팅.

			return answer;
		}
	}

}

// 프로그래머스에서 풀었던 문제들을 그대로 가져와서 메인메소드는 따로 존재하지 않는다, 테스트에 통과된 문제만 올릴 예정.
