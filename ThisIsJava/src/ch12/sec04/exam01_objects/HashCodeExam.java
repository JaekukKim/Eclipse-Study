package ch12.sec04.exam01_objects;

import java.util.Objects;

public class HashCodeExam {
	public static void main(String[] args) {
		Student stu = new Student(1,"재국");
		Student stu2 = new Student(1,"재국");
		
		if (stu.hashCode()==stu2.hashCode()) {
			if (stu.equals(stu2)) {
				System.out.println("해시코드와 데이터값이 같으므로 논리적으로 동등한 객체입니다");
			} else {
				System.out.println("데이터 값이 다르므로 동등한 객체가 아닙니다");
				
			}
		} else {
			System.out.println("해시코드가 다르므로 동등한 객체가 아닙니다.");
		}
	}
	
	//비교하기 위한 클래스 생성.
	static class Student{
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.sno=sno;
			this.name=name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
			// sno와 name의 필드 값을 받아 데이터를 비교하고 해시코드를 생성해줌.
		}
		
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Student stu) { // obj가 Student의 객체에 속해있는지 확인.
				if (stu.sno==this.sno) {
					if (stu.name.equals(this.name)) {
						return true;
					}

					
				}
				
			}
			return false;
		
		}
	}

}
