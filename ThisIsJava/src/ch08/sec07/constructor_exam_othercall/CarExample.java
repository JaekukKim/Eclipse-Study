package ch08.sec07.constructor_exam_othercall;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		
		System.out.println("제조 회사 : " + car1.company);
		System.out.println();
		
		Car car3 = new Car("캐스퍼");
		
		System.out.println("제조회사 : " + car3.company);
		System.out.println("모델 : " + car3.model);
		System.out.println();
		
		
		Car car2 = new Car("캐스퍼", "흰색");
		
		System.out.println("제조회사 : " + car2.company);
		System.out.println("모델 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println();
		
		Car car4 = new Car("모닝", "노랑색", 260 );
		
		System.out.println("제조회사 : " + car4.company);
		System.out.println("모델 : " + car4.model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고 속도 : " +car4.maxspeed);
		System.out.println();
		
		System.out.println("자동차소개");
	}


}
