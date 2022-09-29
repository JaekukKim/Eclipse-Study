package ch08.sec08.exam01_method__declaration;

public class Computer {
	public int sum1(int[] values) {

		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			
			sum+=values[i];
			
//			int value = values[i];
//			sum += value;
			// 인덱스에 있는 값을 호출한 다음에 더하는 방식
		}
		return sum;
//		
//		for (int value : values) { // 향상된 포문 위랑 동일함.
//			sum += value;

		// 배열 내에 있는 타입의 데이터를 있는 그대로 순환시킴.
//		}

	}

	public int sum2(int... values) {

		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}

}
