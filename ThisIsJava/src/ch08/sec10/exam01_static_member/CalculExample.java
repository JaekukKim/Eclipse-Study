package ch08.sec10.exam01_static_member;

public class CalculExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result = 11*12*Calcul.pi;
		
		int result1 = Calcul.plus(11, 31);
		
		int result2 = Calcul.minus(9223, 4342);
		
		int result3 = Calcul.times(441, 675);
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
