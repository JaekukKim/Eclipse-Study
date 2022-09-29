package ch07.sec03.Exam_parents_constructor;

public class StuExam {
	public static void main(String[] args) {
		Student stu = new Student("재국","111111",31);
		
		System.out.println (stu.name);
		System.out.println(stu.ssn);
		System.out.println(stu.stuNo);
	}
	

}
