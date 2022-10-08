package Academy.Array;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 길이를 입력 해 주세요.");
		int inputNum = sc.nextInt();

		int[] num = new int[inputNum]; // 배열선언 이 상태, new로 배열이 선언됬으면 초기의 값은 전부 0이다.
		int divisor = 0; // 돌려막기용

		System.out.println("----초기 배열의 값은?----");
		for (int i = 0; i < num.length; i++) { // 배열의 초깃값들을 설정 해 주는 for문
			num[i] = i; // 0번째 인덱스부터 9번째 인덱스까지 값들을 for문의 i값으로 대입.
			// 옷을 입혀주는 과정 (결과는 0 1 2 3 4 5 6 7 8 9)
			System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println("\n===========================절취선=======================");
		System.out.println();

		// 0~9사이의 임의의 정수를 구해서(int s = (int)(Math.random()*10);) //Math.random(); =
		// 0<n<1사이 무작위 실수값.
		// 구한 정수에 해당하는 값과(인덱스가 아닌 정수타입의 s) 맨 처음 방의 값을 교환(인덱스0과 나온 값(s)을 교환)한다.

		// 인덱스0과 s값을 교환한다.

		for (int i = 0; i < 100; i++) {
			// 여기서의 for문은 인덱스랑 전혀 관련이 없다. for문은 숫자 그 자체로도 쓸 수 있지만 순서를 나열하기위한 도구로도 쓸수있다.
			// 여기서의 for문은 "도구"로써 활용.

			int s = (int) (Math.random() * inputNum); // s의 범위는 0부터 10.xx(이지만 강제캐스팅으로 소숫점 날려버림)
														// 결국 나오는 범위는 (0,1,2,3,4,5,6,7,8,9)

			divisor = num[0]; // 인덱스0의 값을 돌리기위한 변수가 필요해. 반드시.
			num[0] = num[s]; // 나온 인덱스0의 값에 인덱스 s를 대입. 왜 인덱스s인지는 배열 내부에서 수를 돌리기 위함.
			// 배열 밖의 값인 그냥 s값을 대입하게 된다면 인덱스0의 숫자만 바뀜.
			num[s] = divisor;

			// 이런 보존형 데이터마이닝 알고리즘 같은 경우엔 그냥 뭔지 모르겠어도 변수하나 더 넣고 시작하는게 마음이 편하다.
		}

		// 섞여진 배열의 값을 출력한다.
		// 최종적인 결과값은 0~9를 무작위로 섞은 배열이 출력되야한다.
		System.out.println("-----무작위로 섞은 배열-----");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");

		}

	}

}
