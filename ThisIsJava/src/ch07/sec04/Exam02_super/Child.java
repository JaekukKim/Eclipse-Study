package ch07.sec04.Exam02_super;

public class Child extends Parents {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속 모드로 변경한당");
			System.out.println("초음속비행한당");
		} else {
			super.fly();
			System.out.println("그냥 날아간당");
		}
	}

}
