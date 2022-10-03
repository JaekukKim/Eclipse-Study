package ch12.sec15.format;

import java.text.DecimalFormat;

public class DecimalFormatExam {
	public static void main(String[] args) {
		double num = 1234567.89;
		
		//DecimalFormat이란? 특정한 숫자를 특정한 "패턴"으로 바꾸는 클래스이다.
		
		DecimalFormat df = new DecimalFormat("0");
		//"0"소숫점을 제외한 패턴으로 출력한다는 의미이다. 이럴때! 소숫점은 반올림이 된다!!
		//DecimalFormat 객체를 생성하고 메소드 괄호부분엔 패턴문자열을 넣어준다. 저 숫자를 대입하는게 아니라 저 "패턴"으로 바꾼다는 것이다.
		System.out.println(df.format(num));
		// 결과값 : 1234568 (정수부분 7이 반올림됨)
		
		df = new DecimalFormat("00000000000.00000");
		System.out.println(df.format(num));
		// 결과값 : 00001234567.89000 (패턴에 0을 넣어줄 시 빈공간은 0으로 채워진다.)
		
		df = new DecimalFormat("###########.#####");
		System.out.println(df.format(num));
		// 결과값 : 1234567.89 (숫자부분을 제외한 나머지 부분이 다닥다닥붙여져서 출력된다)
		
		//자릿수를 구분지어 출력하기. (많이씀)
		df = new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		// 결과값 : 1,234,567.9 (자릿수가 3자리마다 구분이 되어 있으며 소숫점은 한자리만 출력이기 때문에 반올림되어 8이 9가 되었다.
	}
	
	
	

}
