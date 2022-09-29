package ch088.sec04_exam01_polymorphism_interface;

public class CarExam {
	public static void main(String[] args) {
		
		// 생성자 호출
		Car car = new Car();
		
		// 
		car.run();
		System.out.println();
		
		
		//구현 객체를 바꿔서 대입.
		car.FLT = new Kum();
		car.FRT = new Kum();
		
		car.run();
	}

}
