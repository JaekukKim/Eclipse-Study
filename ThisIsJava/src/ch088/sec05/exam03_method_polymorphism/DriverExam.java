package ch088.sec05.exam03_method_polymorphism;

public class DriverExam {
	public static void main(String[] args) {
		Driver dr = new Driver(); // 객체 생성

		Bus bus = new Bus(); // 구현객체 생성
		Taxi taxi = new Taxi();
		
		dr.drive(taxi);
		dr.drive(bus);
	}

}
