package ch12.free_section.booleanEqual;

public class MemberExam {
	public static void main(String[] args) {
		Member obj1 = new Member("Green");
		Member obj2 = new Member("Green");
		Member obj3 = new Member("blue");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1, obj2 : 두 객체가 논리적으로 동등합니다.");
			
		}else {
			System.out.println("논리적으로 동등하지 않습니다.");
		}
		if (obj1.equals(obj3)) {
			System.out.println("obj1, obj3 : 두 객체가 논리적으로 동등합니다.");
			
		}else {
			System.out.println("논리적으로 동등하지 않습니다.");
		}
		
		
	}

}
