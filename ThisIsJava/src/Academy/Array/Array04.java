package Academy.Array;

public class Array04 {
	public static void main(String[] args) {
		int[] ball = new int[45];

		// 배열의 각 요소에 1~45값을 순서대로 저장하세요.
		System.out.println("초기값은?");
		for (int i = 0; i < ball.length; i++) {
			// 도구로쓸때는 마음대로 해도 되는데 **인덱스 번호를 건드릴때는 왠만해선 안건드리는게 편함**.
			ball[i] = i + 1;
			System.out.print(ball[i] + " ");
		}

		int saveTemporary = 0;

		System.out.println();
		System.out.print("\n=============추첨하기=============");
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 45);
			// 무작위로 번호 뽑고 중복배열 제거.
			saveTemporary = ball[0];
			ball[0] = ball[random];
			ball[random] = saveTemporary;
		}

		System.out.print("\n당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}

	}
}
