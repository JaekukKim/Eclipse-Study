package ch12.sec15.format;

import java.text.MessageFormat;

public class MessageFormatExam {
	public static void main(String[] args) {
		// 매개변수화 시킨 패턴을 출력하는것이다. (좀 어려울 예정)

		String id = "AudenKim";
		String name = "김재국";
		String tel = "010-1111-2222";

//		String text = "회원 ID: AudenKim \n회원 이름 : 김재국 \n회원 전화 : 010-1111-2222";

		// 데이터가 정해진게 아니라 사용자의 입력에 의해 동적으로 데이터가 들어오는 거라면 저 위처럼 작성해선 안된다. 그럼 어떻게 해야하는가.
		String text = "회원 ID: {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		// 이런식으로 매개변수화를 시켜주어야 한다. 0~n번까지의 인덱스값을 지정해준다. 위는 0 1 2.

		// 이렇게 쓰기 위해선 특별한 포멧방식이 필요하다
		String result = MessageFormat.format(text, id, name, tel);
//		MessageFormat.format(patten, arguments) 의 형식으로 작성한다. (문자열의 패턴, 전달값) 이란 의미이다.
		System.out.println(result);
		// 결과값
//		회원 ID: AudenKim 
//		회원 이름 : 김재국 
//		회원 전화 : 010-1111-2222
		// text 변수의 부분처럼 정해준다면 저 부분은 바꿀 필요 없이 id,name,tel만 바꿔주면 자연스럽게 출력이 된다!
		
		System.out.println("----데이터 베이스(DB)에서 사용하는 sql을 완성하는 방법 실습하기----");
		String sql  = "insert into member values({0},{1},{2})"; // 왜 인덱스 1과 2가 출력이될까...
		Object[] arguments = {"Auden, 김재국, 010-1111-2222"}; //배열형식으로 전달값 선언.
		String result2 = MessageFormat.format(sql, arguments);
		System.out.println(result2);
		// sql 방식의 선언이다, 일단 있다고만 알아두자
		// 이 파트의 핵심은 데이터가 동적으로 제공이 되어 문자열이 완성된다는거만 정확히 알자.

	}

}
