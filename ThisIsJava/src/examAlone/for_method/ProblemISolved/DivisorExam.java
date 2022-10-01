package examAlone.for_method.ProblemISolved;

public class DivisorExam {
	public static void main(String[] args) {
		// 1부터 100까지 각 정수들의 약수를 구하여라
		// A%B==0 B는 A의 약수

		for (int i = 1; i <= 100; i++) {
			//for문으로 반복될 범위를 설정
			System.out.println(i + "의 약수는?");
			System.out.print("-> ");
			
			//어떤 약수 n의 특징은 n을 특정한 수 x로 나누었을때 0이 된다는것이다. 그리고 보통 범위는 1부터 자기 자신까지이다.
			//그럼 n%x==0이라면 x는 n의 약수라는 얘기이다. 일일히 수를 넣어주는건 굉장히 효율이 좋지 못하다.
			
			for (int j = 1; j <= i; j++) {
				//그래서 이중for문으로 j의 범위를 첫번째 for문의 i까지로 설정해주면 아주 간단하게 해결이 가능하다!!
				
				if (i % j == 0) {
					//그리고 if문으로 i%j가 0이되는 j를 걸러내면된다.
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
	}
} // 소수구하기의 파생, 약수구하기