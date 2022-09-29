package ch13.sec01.exam0101_box;

public class GenericExam {
	public static void main(String[] args) {
		
		Box<String> box = new Box<>();
		// 박스를 불러 올 때 구체적인 타입을 반드시 명시해주어야 한다. 이런식으로 사용하는게 메모리 효율이 매우 좋음.
		box.content = "안녕하세요";
		String str = box.content;
		
		Box<Integer> box1 = new Box<>();
		box1.content = 100;
		int N = box1.content;
		System.out.println(str + " " + N +"번째 당첨자입니다");
	}

}
