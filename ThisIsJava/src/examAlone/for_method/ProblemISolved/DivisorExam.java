package examAlone.for_method.ProblemISolved;

public class DivisorExam {
	public static void main(String[] args) {
		// 1부터 100까지 각 정수들의 약수를 구하여라
		// A%B==0 B는 A의 약수

		for (int i = 1; i <= 100; i++) {
			System.out.println(i + "의 약수는?");
			System.out.print("-> ");
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
} // 소수구하기의 파생, 약수구하기