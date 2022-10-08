package Academy.Array;

import java.util.Arrays;

public class Array07 {
	public static void main(String[] args) {
		int num = 6;
		int[] ball = new int[num];

		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();

		// 1부터 45사이의 정수, 45 포함.
		for (int i = 0; i < ball.length; i++) {
			int randomNumber = (int) (Math.random() * 45);
			ball[i] = randomNumber;

			// 중복 검사 방식은 앞의값을 뒤의 값이랑 비교하는 방식으로 간다.
			// ex) 2번째 수는 1번째랑 검사, 3번째수는 2번째 검사 후 1번째로 검사...
			// 3->2->1 , 4->3->2->1... 이런식으로

			if (i > 0) {

				// 첫번째 방은 비교할 대상이 없으므로 중복검사에서 제외. (i>0)
				// 앞에서 뒤로 검사하는 방식, i+1 => i => i-1...

				for (int j = 0; j < i; j++) {
					// 5->4->3...식의 검사를 구현해주기 위해 j값을 i값보다 작게 설정,
					// 그럼 j값은 i값 바로직전까지 검사를 실행.
					if (ball[j] == ball[i]) {
						// 만약 j값이 i값과 같다면 i--를 해준다.
						// i--의 의미 : 과거로 되돌림의 의미로 생각해주면된다.
						// i값이 원래 값이였을때 값이 겹쳐버리니깐 겹치지 않기위해 i를 한단계 돌리고 break로 탈출해주는것이다.
						i--;
						break;
					}
				}
			}
		}

		// 중복되지않은 6개의 정수를 추출하여 배열에 저장.
		// 오름차순 정렬
		// 개인적인 생각인데 배열의 정렬은 for문으로 굴리는건 좀 비효율적이라고 생각한다. 그냥 Arrays.sort쓰자...

		Arrays.sort(ball);

		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i] + " ");
		}
	}
}