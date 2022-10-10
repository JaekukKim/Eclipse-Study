package ch13.sec03.exam04_munti_type_parameter;

public class BoxGeneric {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.content = "100";
		// Box 객체의 content 값으로 문자열 100을 저장한다는 의미.
		
		Box box2 = new Box();
		box2.content = "100";
		
		Box box3 = new Box();
		box3.content = 100;
		// Box 객체의 content 값으로 정수타입 100을 저장한다는 의미.
		
		boolean result = box1.compare(box2);
		System.out.println("box1과 box2의 저장값은 같나요? : " + result);
		
		boolean result2 = box1.compare(box3);
		System.out.println("box1과 box3의 저장값은 같나요? : " + result2);
	}

}
