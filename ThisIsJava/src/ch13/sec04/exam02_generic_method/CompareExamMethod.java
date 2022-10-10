package ch13.sec04.exam02_generic_method;

public class CompareExamMethod {
	public static void main(String[] args) {
		Pare<Integer, String> p1 = new Pare<>(1, "사과");
		// 타입파라미터의 구체적인 타입을 지정하고 매개값을 넣어준다.
		Pare<Integer, String> p2 = new Pare<>(1, "사과");
		boolean result = Util.<Integer,String> compare(p1, p2);
		// 위의 Integer과 String는 생략해주어도 된다. 컴파일러가 p1,p2값을 보고 유추 할 수 있기 때문.
		
		if (result) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		System.out.println("===타입 파라미터 변경===");
		
		// 다른 타입파라미터를 넣어서 해보자
		Pare<String, String> p3 = new Pare<>("user1", "사과");
		// 타입파라미터의 구체적인 타입을 지정하고 매개값을 넣어준다.
		Pare<String, String> p4 = new Pare<>("user2", "사과");
		boolean result2 = Util.compare(p3, p4);
		// 위의 Integer과 String는 생략해주어도 된다. 컴파일러가 p1,p2값을 보고 유추 할 수 있기 때문.
		
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
	}

}
