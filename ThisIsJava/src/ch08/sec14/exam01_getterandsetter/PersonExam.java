package ch08.sec14.exam01_getterandsetter;

public class PersonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person itsme = new Person();

		itsme.setSpeed(-50);
		System.out.println("현재 속도 : "+itsme.getSpeed());
		
		itsme.setSpeed(10);
		System.out.println("현재 속도 : " + itsme.getSpeed());
		
		if (!itsme.isMove()) {
			itsme.setMove(true);
			
		}
		System.out.println("현재 속도 : " + itsme.getSpeed());
		
		

	}

}
