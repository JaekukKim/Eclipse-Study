package examAlone.for_method.ProblemISolved;

public class EachPlus {
	public static void main(String[] args) {
		// 각 자릿수의 합을 구하는 방식
		// 10으로 나누었을때 나온 "나머지"는 나눈 수의 1의 자리랑 같다.
		// 10으로 나누고 나온 "몫"에 10을 곱한다면 1의자리를 0으로 만들어버리는 효과가있다.

		int num = 13570;
		int sum = 0; // 각 자릿수를 저장하는 변수

		while (num>=1) {
			sum += num%10; // sum에 각 자릿수를 저장한다, 자릿수를 구하기 위해선 주어진 숫자 %10의 나머지를 구해한다.
			
			num = num/10; //주어진 숫자를 10으로 나눈 "몫"은 1의 자리가 0일것이다.

		} System.out.println("자릿수의 합은? : " + sum);
	}

}
