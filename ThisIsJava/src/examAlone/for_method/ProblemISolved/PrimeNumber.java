package examAlone.for_method.ProblemISolved;

public class PrimeNumber {
	   public static void main(String[] args) {
	      // 1에서 100까지의 수 중 소수를 구하시오
	      // 소수는 1과 자기 자신으로만 나누어지는 수이다.
	      // 1 2 3 5 7 11 13 17 19 23 29 31 37 41

	      int s = 0; // s는 i를 j로 나누었을때 나누어 떨어지는 수를 카운팅 하는 수이다.

	      for (int i = 2; i <= 100; i++) { // 100까지의 범위설정
	         for (int j = 2; j <= i; j++) { 
	        	 // i가 j와 같은 수로 나누어 떨어지는지를 볼라면 범위를 자기 자신까지만 해주면됨
	            if (i % j == 0) { // i를 j로 나누었을때 나머지가 0, 즉 나누어 떨어진다면
	               s++; // s에 1을 더한다. 나눴을때 나머지가 0이 되는 횟수를 카운팅.
	            }
	         }
	         
        //for문은 "조건문" (위의 내부 for문에서 j <= i; 여기에 해당 하는 부분) 이 거짓이 될때까지 무한하게 반복.
	    //********이 기초를 망각하고 있어서 왜 4에선 s가 1이 됬는데 출력이 안됬지? 하는 멍청한생각을 했다!!!******
        //기초중의 기초이니 다시한번 기억하고 가자.

	         if (s == 1) { 
	            System.out.println(i); // 그리고 그 값을 출력.
	         }
	         s = 0; // s를 다시 0으로 초기화하여 판별하기위한 수로 되돌림.
	      }

	   }
	}