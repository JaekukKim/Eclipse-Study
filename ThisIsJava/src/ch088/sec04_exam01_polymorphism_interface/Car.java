package ch088.sec04_exam01_polymorphism_interface;

public class Car {
	Tire FLT = new Han();
	Tire FRT = new Han();
	Tire BLT = new Han();
	Tire BRT = new Han();
	
	void run() {
		FLT.roll();
		FRT.roll();
		BLT.roll();
		BRT.roll();
	}
	
//	Tire FLT2 = new Kum();
//	Tire FRT2 = new Kum();
//	Tire BLT2 = new Kum();
//	Tire BRT2 = new Kum();
//	
//	void run1() {
//		FLT2.roll();
//		FRT2.roll();
//		BLT2.roll();
//		BRT2.roll();
//	}
	

}
