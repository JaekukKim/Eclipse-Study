package ch12.free_section.booleanEqual;

public class Student {
	
	//필드선언
	private int no;
	private String name;
	
	//매개변수가 있는 생성자 선언.
	public Student (int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	//getter메소드 선언
	public int getNo() {
		return no;
		
	}
	public String getName() {
		return name;
	}
	
	//hashcode 메소드 재정의
	public int hashcode() {
		int hashcode = no + name.hashCode(); // object에 속해있는 해쉬코드 메소드를 재정의하여 이름과 번호를 합한 새로운 해시코드를 생성하도록 재정의함.
		return hashcode;
	}
	
	//equal메소드 재정의.
	@Override
	public boolean equals(Object obj) { // object의 equals 메소드를 재정의하여 student 객체인지 확인하고 번호와 이름이 같은지를 보고 true,false를 출력한다.
		if (obj instanceof Student st) {
			if (no == st.getNo() && name.equals(st.getName())) { //name.equals(st.getName())
				return true;
			}
			
		}
		return false;
	}

}
