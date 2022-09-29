package ch12.sec08.exam01_split_stringtoknizer;

import java.util.StringTokenizer;

public class StringtokenizerExam {
	public static void main(String[] args) {
		String text = "김재국/정의태/이준호";
		
		StringTokenizer st = new StringTokenizer(text, "/"); //Stringtokenizer은 구분자가 1개밖에 들어가지 않는다.
		int countTokens = st.countTokens();
		System.out.println(countTokens); // 몇개의 토큰이 있는지 조사.
		
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken(); // 토큰을 하나씩 가져오라는 의미의 nextToken(); 메소드이다.
			System.out.println(token); // 일반적으로 이렇게 쓰지는 않는다. 써도 되긴 함.
			
		}
		st = new StringTokenizer(text, "/"); // StringTokenizer로 만들어진 객체는 다른 객체와는 다르게 재사용이 불가능하다.
		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token); 
			// 이런식으로 작성을 주로 한다. while문과 boolean타입의 hasmoretokens 메소드를 활용해 가져올 토큰이 있는지를 확인을 먼저 하고 가져온다.
		}
		
	}

}
