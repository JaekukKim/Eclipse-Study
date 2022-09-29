package examAlone.for_method.ProblemISolved;

public class Palindrome {
	public static void main(String[] args) {
		// 회문수 (palindrome)
		// 숫자를 앞으로읽나 뒤로읽나 같음
		// 11111 12321 1234321
		// 아래의 수가 회문수인지 아닌지를 판별하라
		
		
		int number = 12321; // 회문수 변수 설정.
		int point = number; // 원래 값을 가지고 작업할 변수.
		int result = 0; // 변수 number를 거꾸로 담을 변수 설정

		while (point != 0) {
			result = result * 10 + point % 10;
			System.out.println("result의 바뀌는 자릿수를 지속적으로 출력합니다 : " + result);
			point = point/10;
			System.out.println("point의 바뀌는 자릿수를 지속적으로 출력합니다 : " + point);
			//처음은 result = 0*10 + 12321%10 => 1이다.
			//point = 12321/10 => 12320이다 이런식으로 1의자리부터 0이 되면서 자릿수를 없애버리는것과 같은
			//효과가 나온다.
		}
		
		if (number == result)
			System.out.println(number + "는 회문수 입니다.");
		else
			System.out.println(number + "는 회문수가 아닙니다.");
	
}

}

