package ch13.sec01.exam01_box;

public class Box {
	private Object object;
	private String str;
	
	public void set(Object obj) {
		this.object=obj; // 오브젝트를 매개변수로 선언하면 자바에서 쓰일 수 있는 모든게 객체로 올 수 있다.
	}
	
	public Object get(String str) {
		this.str=str;
		System.out.println(str+"를 꺼냅니다.");
		return object;
	}

}
