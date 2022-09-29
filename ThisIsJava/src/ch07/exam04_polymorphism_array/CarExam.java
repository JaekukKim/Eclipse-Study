package ch07.exam04_polymorphism_array;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemlocation = car.run();
			if (problemlocation != 0) { // 인덱스 번호의 리턴이 +1이고, 1~4중에 하나가 이쪽에 들어오기 때문에.
				System.out.println(car.tires[problemlocation - 1].location + " Comtire1로 교체");
				// problemlocation-1은 인덱스 번호이고 인덱스 번호.로케이션으로 위치를 읽고 고장난 타이어를 교체.
				car.tires[problemlocation - 1] = new ComTire1(car.tires[problemlocation - 1].location, 15);
				// location 값이 문자열이라 오류가 안뜸.
			}
		}
		System.out.println("-------------------------------------");
	}

}
