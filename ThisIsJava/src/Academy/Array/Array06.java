package Academy.Array;
import java.util.Arrays;

public class Array06 {
	public static void main(String[] args) {
		int[] number = new int[10];
		int[] counter = new int[10];

		System.out.print("랜덤 초기값\n-> ");
		for (int i = 0; i < number.length; i++) {
			int innerNumber = (int) (Math.random() * 10);
			number[i] = innerNumber;
			System.out.print(number[i] + " ");
		}

		// 이쁘게 보이고 싶은 욕심
		System.out.println();
		System.out.print("\n오름차순 정렬\n-> ");
		
		Arrays.sort(number);
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

		// 숫자를 카운팅 해주기 위한 counter배열 초기화.
		System.out.print("\n\ncounter 배열의 초깃값은?\n-> ");
		for (int i = 0; i < counter.length; i++) {
			counter[i] = 0;
			System.out.print(counter[i] + " ");
		}

		System.out.println("\n");

		// 0~9사이의 정수가 각각 몇개인지?
		// counter i번째의 값과 number i번째의 인덱스값이 같으면 count++, 그 값을 counter i번째의 값에 카운팅.
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < counter.length; j++) {
				if (number[j] == i) {
					counter[i]++;
				}

			}
			System.out.println("- " + i + " 의 갯수는 " + counter[i] + " 개 입니다.");
		}

	}
}