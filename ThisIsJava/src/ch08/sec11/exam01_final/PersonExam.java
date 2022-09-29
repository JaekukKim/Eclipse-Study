package ch08.sec11.exam01_final;

public class PersonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person N = new Person("111111-1111111","재국");
		
		System.out.println(N.nation);
		System.out.println(N.ssn);
		System.out.println(N.name);
		
		//불러온 값들 중 nation과 ssn은 파이널 필드이기 때문에 절대로 값을 변경 할 수 없다.
		
		//final 필드가 아닌것은 값이 변경 가능 name만 파이널 필드가 아니다.
		
		N.name = "병신";
		System.out.println(N.name);
		

	}

}
