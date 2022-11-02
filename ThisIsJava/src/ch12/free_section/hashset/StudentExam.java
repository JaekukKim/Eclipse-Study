package ch12.free_section.hashset;

public class StudentExam {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "재국");
		Student s2 = new Student(1, "재국");
		
		if (s1.hashcode()==s2.hashcode()) { //s1과 s2의 해시코드가 같으면
			if (s1.equals(s2)) { // s1과 s2의 데이터가 같은지를 본다.
				System.out.println("논리적 동등 객체입니다.");
			}else {
				System.out.println("데이터가 다르므로 논리적으로 동등하지 않습니다");	
		}
		} else {
			System.out.println("해시코드가 다르므로 논리적으로 동등하지 않습니다.");
		}

	}

}
