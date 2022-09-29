package ch12.sec05.exam01_constructor;

public class Byte {
	public static void main(String[] args) {
		byte[] bytes = {12,43,76,90,111,23,56,97,88,55};
		
		String str1 = new String(bytes); // 바이트를 문자열로 변경
		
		System.out.println(str1); // 출력하면 문자 코드번호가 출력됨.
	}

}
