package ch08.sec08.callthemethod.outter;

import java.util.Iterator;

public class Car {
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("키를 넣고 돌립니다");
	}
	
	void run() {
		for (int i = 0; i <=100; i+=10) {
			speed =i;
			System.out.println("달리는 중입니다. (시속 : " + speed + "km/h)");
			
		}
	}

}
