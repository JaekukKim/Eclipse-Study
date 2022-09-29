package ch07.exam03_polymorphism_important;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemlocation = car.run();
			switch (problemlocation) {
			case 1:
				System.out.println("앞 왼쪽 타이어를 ComTire1로 교체");
				car.FLT = new ComTire1("왼쪽 앞", 15);
				break;
			case 2:
				System.out.println("앞 왼쪽 타이어를 ComTire2로 교체");
				car.FRT = new ComTire2("오른쪽 앞", 17);
				break;
			case 3:
				System.out.println("앞 왼쪽 타이어를 ComTire1로 교체");
				car.BLT = new ComTire1("왼쪽 뒤", 13);
				break;
			case 4:
				System.out.println("앞 왼쪽 타이어를 ComTire2로 교체");
				car.BRT = new ComTire2("오른쪽 뒤", 12);
				break;
			}
		}
		System.out.println("-------------------------------------");
	}

}
