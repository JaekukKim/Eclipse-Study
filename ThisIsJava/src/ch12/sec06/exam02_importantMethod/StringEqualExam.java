package ch12.sec06.exam02_importantMethod;

public class StringEqualExam {
	public static void main(String[] args) {
		String str1 = new String("김재국");
		String str2 = "김재국";
		String str3 = "김재국";

		if (str1 == str2) {
			System.out.println("같은 String객체를 참조합니다");

		} else {
			System.out.println("다른 String객체를 참조합니다.");
		}
		if (str1.equals(str2)) {
			System.out.println("문자열이 동일합니다");
			
		} else {
			System.out.println("문자열이 같지 않습니다.");
		}

	}

}
