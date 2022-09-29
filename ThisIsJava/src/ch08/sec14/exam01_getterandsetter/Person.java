package ch08.sec14.exam01_getterandsetter;

public class Person {
	
	//private 필드 선언.
	private int speed;
	private boolean move;
	
	//speed 필드의 getter, setter 선언
	public int getSpeed() {
		return speed;
	}
	//접근제한자 + 타입 + getFieldName(){} + 리턴타입 : 필드타입 의 방식으로 getter를 선언해준다.
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}
		else {
			this.speed=speed;
		}
	}
	//접근제한자 + 리턴타입 + setFieldName((매개변수)필드타입 + fieldName) 의 순서로 setter를 선언해준다.
	
	public boolean isMove() {
		return move;
	}
	//boolean타입은 isFieldName + 리턴값:필드값 의 형식으로 getter를 선언해준다.
	
	public void setMove(boolean move) {
		this.move = move;
		if (move == true) {
			this.speed = 0;
			
		}
		
	}

}
