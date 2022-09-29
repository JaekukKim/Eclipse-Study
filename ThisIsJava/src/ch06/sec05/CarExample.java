package ch06.sec05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car mycar = new Car();
		// Car라고 하는 객체 내에 있는 필드를 불러온 다음 새로운 변수에 대입을 한다. 변수가 없으면 안된다.
		// 객체와 필드를 사용하기 위해선 반드시 거쳐야 하는 구문.
		
		mycar.model = "재국";
		mycar.age = 31;
		mycar.sex = "남";
		mycar.alive = true;

		
		//지금 이 객체에 선언되지 않은 Car.java 파일에 생성된 라이브러리 클래스에서 생성한 필드들의 변수를 바꿔주는 개념이다.
		//여기서 라이브러리 클래스에서 짜여진 필드 명, 코드 등 클린코드로 작성 해 놓는다면 매우 깔끔하게 복잡함 없이 사용 가능하다는 점이다.
				
		//Car 객체에서 생성된 필드 값 읽기. (Car 객체는 다른 java파일이다.)
		System.out.println("이름 : " + mycar.model);
		
		if (mycar.age == 20) {
			System.out.println("응애 나 애기");
			System.out.println("나이 : " + mycar.age);
			
		}
		
		else {
			System.out.println("나이 : " + mycar.age);
		}
		
		
		if (mycar.alive == true) {
			
			System.out.println("생존여부 : 생존");
			
		}
		else {
			System.out.println("생존여부 : 뒤짐");
			
		}
		

	}

}
