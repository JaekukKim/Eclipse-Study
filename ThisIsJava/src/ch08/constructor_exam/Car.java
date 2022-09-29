package ch08.constructor_exam;

public class Car {
	
	String company = "자동차회사";
	String model;
	String color;
	int maxspeed;
	
	Car(){}
	
	Car(String model){
//		this.model = model;
//		this.color = null;
//		this.maxspeed = 0;
// 한번에 주석처리 하는 방법은 컨트롤+/를 범위 설정 후 해주면 된다.
		
		this(model,null,0);
		
	//this(타입에따른매개변수명...~)으로 묶어서 코드 중복을 줄이기 가능.
	}
	
	Car(String model , String color){
//		this.model = model;
//		this.color = color;
//		this.maxspeed = 0;
		
		this(model,color,0);
	}
	
	Car(String model , String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
}
}
