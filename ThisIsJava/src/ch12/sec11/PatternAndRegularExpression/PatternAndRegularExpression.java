package ch12.sec11.PatternAndRegularExpression;

import java.util.regex.Pattern;

public class PatternAndRegularExpression {
	public static void main(String[] args) {
		
		String regExp = "^(02|010)-\\d{3,4}-\\d{4}$";
		//02나 010으로 시작해야하며 (02|010) 3개부터 4개의 숫자가 와야하고 (\\d{3,4})
		//반드시 4개의 숫자가 와야한다 (\\d{4}). 라는 의미이다.
		//원래 정규표현식의 한개의 숫자 기호는 \d이나 자바에선 역슬래시를 확실하게 인식시켜주기위해 \\를 두번쓴다.
		
		String str = "010-123-4567";
		//이제 문자열이 원하는 양식에 맞는지 확인을 해보자.
		
		boolean result = Pattern.matches(regExp, str);
		//boolean 변수명 = Pattern.matches(정규식, 검증할문자);
		if (result) {
			System.out.println("1.정규식과 문자열이 일치합니다");
		} else {
			System.out.println("1.정규식과 문자열이 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//한개이상의 알파벳이나 숫자가 와야하고(\\w+) @가 와야하며 다시 한개이상의 알파벳이나 숫자가 와야하고(\\w+)
		// 그다음 . (\\.)이 와야하고
		//그룹핑을 한 뒤 .과 한개이상의 알파벳이나 숫자가 와도 되지만 이 부분 전체가 없거나 한개 이상 와야한다 ((\\.\\w+)?)
		
		str = "angle@naver.com";
		
		result = Pattern.matches(regExp, str);
		//boolean 변수명 = Pattern.matches(정규식, 검증할문자);
		if (result) {
			System.out.println("2.정규식과 문자열이 일치합니다");
		} else {
			System.out.println("2.정규식과 문자열이 일치하지 않습니다.");
		}
		
		// 결과
		//1.정규식과 문자열이 일치합니다
		//2.정규식과 문자열이 일치합니다
	}

}

// 정규식 표현 정리
//	https://zzang9ha.tistory.com/322 정리가 너무 잘 되어있는 블로그같다.


