package ch10.exam01_equals;

public class MemberExam {
	public static void main(String[] args) {
		Member obj1 = new Member("Green");
		Member obj2 = new Member("Green");
		Member obj3 = new Member("Red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 같습니다");

		} else {
			System.out.println("같지 않습니다"); // 이럴때는 같지 않습니다 라고 나온다. 왜냐면 객체의 "번지수"를 비교하는 것이기 때문.
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 같습니다");

		} else {
			System.out.println("같지 않습니다"); // 이건 객체의 번지수도 다를 뿐더러 값 자체도 다름.
		}
	}

}
