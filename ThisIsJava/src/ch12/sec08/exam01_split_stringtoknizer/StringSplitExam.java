package ch12.sec08.exam01_split_stringtoknizer;

public class StringSplitExam {
	public static void main(String[] args) {
		
		//split(); 클래스를 활용하여 문자열 나누기.
		String text = "김재국&이준호,전현석,정의태,김자바-이자바";
		String[] names = text.split("&|,|-"); //또는 or 은 | 임
		for (String name : names) {
			System.out.println(name);
			
		}
	}

}
