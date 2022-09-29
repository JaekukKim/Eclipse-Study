package ch12.sec06.exam02_importantMethod;

public class StringChatAtExam {
	public static void main(String[] args) {
		String ssn = "111111-2341523"; // 문자열 추출해서 리턴할거임
		char sex = ssn.charAt(7);

		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;

		case '2':
		case '4': // char타입이라 ''로 해야함 ""안됨.
			System.out.println("여자입니다.");
			break;
		}
	}

}
