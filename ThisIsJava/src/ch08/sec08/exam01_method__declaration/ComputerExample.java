package ch08.sec08.exam01_method__declaration;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();

		int[] values = { 1, 2, 3, 4, 5 };
		int result1 = myCom.sum1(values);
		System.out.println("총 합은? : " + result1);

		Computer myCom2 = new Computer();
		int result2 = myCom.sum1(new int[] { 1, 3, 5, 7, 9 });
		System.out.println(result2);

		int result3 = myCom.sum2(1, 2, 3, 4);
		System.out.println(result3);

		int result4 = myCom.sum2(10, 20, 33, 44, 88);
		System.out.println(result4);

	}

}
