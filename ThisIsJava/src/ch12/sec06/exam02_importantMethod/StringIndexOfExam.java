package ch12.sec06.exam02_importantMethod;

public class StringIndexOfExam {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		
		System.out.println(location); // 프로그래밍이라고 하는 문자열이 시작되는 인덱스 값을 호출한다.
		
		
		if (subject.indexOf("자바") != -1) {
			
		}else {
			
		}
	}

}
