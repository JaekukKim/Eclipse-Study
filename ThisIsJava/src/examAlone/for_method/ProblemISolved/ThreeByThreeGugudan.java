package examAlone.for_method.ProblemISolved;

public class ThreeByThreeGugudan {
	public static void main(String[] args) {

		// 구구단 3행 3열 문제.
		// -----------피드백----------
		// 이중 for문으로 덤비다가 건들지도 못함. (사고의 유연성 부족)
		// for문 증감식 부분은 단순히 ++라고 고정하고 생각함. (사고의 유연성 부족)
		// 줄관리하는건] 아무리 sysout을 도배를 해놔도 해결할수 없는 부분이였음
		// if문으로 i나 j 3일때 줄바꾼다를 실행하는건 딱봐도 의미가 없는데 매달려있었음.

		for (int i = 1; i <= 9; i += 3) { // i의 값을 3씩 증가시켜주어서 행을 관리함.
			for (int j = 1; j <= 9; j++) { // 구구단의 1~9까지 곱하는 수 설정
				for (int k = i; k < i + 3; k++) { 
	// k의 값을 i에 연관지어 행과 열을 동시에 관리 (ex)i가 1일때 k는 1부터 3까지이다. 즉 3단까지만 줄력한다는 것.
					System.out.print(k + " x " + j + " = " + k * j + "\t");
				}
				System.out.println();
			}
			System.out.println("===========================================");

		}
	}
}