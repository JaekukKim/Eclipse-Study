package ch08.sec08.callthemethod.inner;

public class CalltheMethodExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalltheMethod ctmd = new CalltheMethod();

		int plusResult = ctmd.plus(10, 20);
		//plus 메소드의 결과값이 나옴과 동시에 그 결과값을 저장하는 변수를 만들어준다.
		//아까는 sysout내에 ctmd.plus()를 넣어서 일일히 해줬다.
		//변수를 만들어 결과값을 저장한다면 이 클래스 내에서 계속 사용이 가능하다.

		System.out.println("plus메소드의 값은? : " + plusResult);

		double avgResult = ctmd.avg(10, 10);
		//위의 plus메소드와 마찬가지이다 하지만 여기선 라이브러리 클래스 내에 있는
		//double타입과 같이 이쪽에서의 avgResult의 변수도 타입을 맞춰줘야한다
		//타입을 맞추는건 반드시 필수적으로 이루어져야 할 부분이며 실수해선 안된다.

		System.out.println("avg메소드의 값은? : " + avgResult);

		ctmd.execute();

		ctmd.println1(" ");

	}

}
