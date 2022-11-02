package ch12.free_section.hashset;

import java.util.HashSet;

public class HashSetExam {
	public static void main(String[] args) {
		HashSet hashset = new HashSet();
		
		Student s1 = new Student(1, "a");
		hashset.add(s1);
		System.out.println("저장된 객체 수 : " + hashset.size());
		System.out.println();
		
		Student s2 = new Student(1, "a");
		hashset.add(s2);
		System.out.println("저장된 객체 수 : " + hashset.size());
		System.out.println();
		
		Student s3 = new Student(1, "a");
		hashset.add(s3);
		System.out.println("저장된 객체 수 : " + hashset.size());
		System.out.println();
		
		
	}

}
