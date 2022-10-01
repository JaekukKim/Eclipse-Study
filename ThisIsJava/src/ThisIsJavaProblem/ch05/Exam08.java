package ThisIsJavaProblem.ch05;

public class Exam08 {
	public static void main(String[] args) {
		// 주어진 배열 항목의 전체 합과 평균을 구하는 코드를 작성.
		// 다차원 배열.

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 }};
						// {인덱스0번째 배열의 내용},{1번째},{2번째}};
		
		int sum = 0; // 전체 합을 저장하는 변수 생성.
		int count = 0; // 배열 내부에 숫자 갯수를 카운팅하는 변수 생성
		double avg = 0; // 배열의 평균값을 구하는 변수 생성.
		
		
		for (int i = 0; i < array.length; i++) {
						//인덱스0번째 배열의 길이, 1번째 배열의 길이, 2번째 배열의 길이
			for (int j = 0; j < array[i].length; j++) {
				// 인덱스i번째 배열의 길이만큼 돌아라.
				sum+=array[i][j];
				count++;
				
			}
		}
		avg = (double) sum/count;
		System.out.println("전체 배열의 합은? : " + sum);
		System.out.println("전체 배열의 평균값은? : " + avg);
	} 

}
