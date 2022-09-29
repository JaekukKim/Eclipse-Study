package ch12.sec05.exam01_constructor;

import java.io.IOException;

public class KeyboardTo {
	public static void main(String[] args) throws IOException { // 예외 떠넘기기
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readbyte = System.in.read(bytes);
		
		String str = new String(bytes, 0 , readbyte-2);
		System.out.println(str);
	}

}
