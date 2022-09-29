package ch12.sec04.exam01_objects;

import java.util.Comparator; // objects와 comparator은 유틸패키지이므로 임포트 해서 사용해주어야 한다.
import java.util.Objects;

public class CompareExam {
	public static void main(String[] args) {
		Student s1 = new Student(2);
		Student s2 = new Student(5);
		Student s3 = new Student(7);
		
		int result = Objects.compare(s1, s2, new Studentcom());
		//new Studentcom()이 부분이 비교자인데. 비교자는 인터페이스의 구현객체로 만들고 이 만드는 과정이 매우매우 중요하다.
		// objects의 compare 메소드를 호출 한 다음 비교자를 생성하자
		System.out.println(result);
		
		result = Objects.compare(s2, s3, new Studentcom());
		System.out.println(result);
	}
	
	//중첩 클래스의 Student 클래스 생성
	static class Student{
		int sno;
		public Student (int sno) {
			this.sno=sno;
		}
	}
	//이 Comparator의 인터페이스는 매우매우 중요하다.
	static class Studentcom implements Comparator<Student>{
		//Comparator 메소드 재정의
		
		@Override
		public int compare(Student a, Student b) { // Student 매개값이 지정이 되었음.
//			if (a.sno < b.sno) return -1;
//			else if (a.sno == b.sno) return 0;
//			else return 1; // 이런식으로 if-elseif-else를 사옹하여 비교를 해주어도 매우 괜찮다. 하지만!!
			
			return Integer.compare(a.sno, b.sno); // 이런식으로 integer의 compare 메소드를 사용하는게 굉장히 효율적이다.
		}
		
	}

}
