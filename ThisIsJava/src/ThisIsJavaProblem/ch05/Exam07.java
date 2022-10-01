package ThisIsJavaProblem.ch05;

public class Exam07 {
	public static void main(String[] args) {
		// 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요.
		int[] array = { 1, 5, 3, 8, 2 };
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (sum < array[i]) {
				//sum값과 array에 저장되어있는 인덱스 값을 차례로 비교한다
				//만약 sum값보다 인덱스데이터가 더 크다면
				//sum에 더 큰 데이터를 저장. 하는 식으로 밀어내기
				sum=array[i];
			}
			System.out.println("제일 큰값이 출력되는 과정 : "+sum);
		}
	}

}
