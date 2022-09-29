package ch12.sec06.exam02_importantMethod;

import java.io.UnsupportedEncodingException;

public class StringGetByte {
	public static void main(String[] args) {
		String str = "안녕하세요"; //UTF-8의 경우는 한글 하나를 3바이트로 해석한다.
		
		byte[] bytes = str.getBytes(); //저장된 문자열을 바이트 배열로 출력한다.
		System.out.println(bytes); // 이상하게 나옴 = 바이트배열로 정상출력 됬음.
		System.out.println("바이트 배열의 길이는? : " + bytes.length);
		
		String str1 = new String(bytes); // 바이트 배열을 문자열로 바꿔주는 과정.
		System.out.println("바이트 배열을 문자로 바꿉니다  " + str1);
		
		
		try {
			byte[] bytes1 = str.getBytes("EUC-KR"); // EUC-KR의 경우는 한글 하나를 2바이트로 해석한다.
			System.out.println(bytes1);
			System.out.println("바이트 배열의 길이는? : " + bytes1.length);
			String str2 = new String(bytes);
			System.out.println("바이트 배열을 문자열로 바꿉니다 : " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		
		}
		
		
		
		
		
	}
}
