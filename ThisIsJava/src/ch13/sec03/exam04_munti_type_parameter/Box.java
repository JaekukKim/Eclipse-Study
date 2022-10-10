package ch13.sec03.exam04_munti_type_parameter;

public class Box<T> {
	public T content;

	// Box안에 들어가 있는 "내용물"이 같은지를 비교
	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		// content 필드값(content.)과 [<T>타입의 매개변수 other](other.content)의 값이 같은지(equals)를 비교하자는 의미의 코딩이다.
		// 미국에서 나온 언어라 그런지 영어의 언어 구조랑 매우 흡사하다.
		// 위의 문장은 content의 필드값이 같은지를 확인한다. <T>타입의 매개변수 other와. 라는 의미나 마찬가지다.
		return result;
	}

}
