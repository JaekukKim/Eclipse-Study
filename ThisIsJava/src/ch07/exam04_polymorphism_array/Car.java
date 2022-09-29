package ch07.exam04_polymorphism_array;

import java.util.Iterator;

public class Car {
	Tire[] tires = {
			new Tire("왼쪽 앞", 1),
			new Tire("오른쪽 앞", 2),
			new Tire("왼쪽 뒤", 3),
			new Tire("오른쪽 앞", 4),
	}; // 배열화 시킴.

	public void stop() {
		System.out.println("멈춤");
	}

	public int run() { // 4개의 타이어가 이상 없이 회전이 되면 0, 특정 타이어가 먼저 회전수가 끝나면 끝난 타이어의 수를 리턴.
		System.out.println("출발 부릉");
		System.out.println();
		
		for (int i = 0; i < tires.length; i++) {//배열의 인덱스 0번부터 시작하는건 바꿀 수 없다. 그래서 0부터시작
			if (tires[i].rolling() == false) {
				stop();
				return (i+1); // 인덱스가 0번부터 시작이므로 +1을 해준다. (1번타이어~4번타이어 이니깐.)
				
			}
			
		}
		return 0;

	}
	

}
