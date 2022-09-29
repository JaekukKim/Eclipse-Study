package ch08.sec07.constructor_exam_othercall;

public class Car {
	
	String company = "자동차회사";
	String model;
	String color;
	int maxspeed;
	
	Car(){}
	
	Car(String model){
		
		this.model=model;
	}
	
	Car(String model , String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model , String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
}
}
