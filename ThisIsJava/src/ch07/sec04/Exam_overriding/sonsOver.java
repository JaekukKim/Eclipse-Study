package ch07.sec04.Exam_overriding;

public class sonsOver extends Over{ // Over 내에 있는 메소드 상속받음
//	@Override
//	double areaCircle(double x) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(x); // 컨트롤 스페이스 단축키를 이용해 메소드 오버라이드를 한 과정이다.
	
	@Override // override 어노테이션이다. 대소문자 구별이랑 앞에 골뱅이. 메소드 오버라이딩이 제대로 됬는지를 계산해준다. 좋은 기능
	double areaCircle(double x) { // 오타나면 재정의가 안된당. 오버라이드 어노테이션을 적용하면 오타가 났을 시 에러가 발생했다고 뜬다.
		System.out.println("부모객체의 areaCicle 실행");
		return Math.PI*x*x; // 이건 손으로 쓴거 오버라이딩 시에는 자식객체에 있는 메소드를 바꿔서 재정의 해준다.
		
		
	}
}


