package ch13.sec02.exam02_generic_type;

public class BoxExam {
	public static void main(String[] args) {
		Box<String> box = new Box<>(); //Box<String> box = new Box<String>(); 와 동일하다.
		//<String>은 Box 객체의 T로 선언된 제네릭 타입 부분을 전부 대체한다.
		//클래스 타입<제네릭타입> 변수명 = new 클래스명<>(); 이런식으로 서술한다.
		
		
		box.set("안녕하세요");
		String str = box.get();
		System.out.println(str);
		
		Box<Integer> box1 = new Box<>();
		box1.set(123); //제네릭타입을 integer로 재설정
		int N = box1.get(); // integer타입은 int로 출력 가능. 방식이 string랑 조금 다르다.
		System.out.println(N);
		
		

		
	}

}
