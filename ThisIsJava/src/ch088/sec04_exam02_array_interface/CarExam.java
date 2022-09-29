package ch088.sec04_exam02_array_interface;

public class CarExam {
	public static void main(String[] args) {
		// 생성자 호출
		Car car = new Car();
		
		
		
		// 
		car.run();
		System.out.println();
		
		
		//구현 객체를 바꿔서 대입.
		
		car.tires[0] = new Kum();
		car.tires[1] = new Kum();
		
		car.run();
	}

}
