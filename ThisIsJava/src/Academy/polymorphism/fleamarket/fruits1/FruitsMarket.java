package Academy.polymorphism.fleamarket.fruits1;

public class FruitsMarket {
	public static void main(String[] args) {
		FruitsBuyer fb = new FruitsBuyer(50000);
		//구매자
		
		AppleSalesMan asm = new AppleSalesMan();
		// 객체를 생성함과 동시에 참조변수에 주솟값이 대입이 되고
		// 생성된 객체는 초기화를 함으로써(매개변수가 있다면 매개값을 이용한 초기화) 객체를 사용할 준비를 한다.
		AppleSalesMan asm2 = new AppleSalesMan();
		AppleSalesMan asm3 = new AppleSalesMan();
		// 사과장수 1,2,3
		asm.initFruitSeller(100, 20000, 1500);
		asm2.initFruitSeller(50, 30000, 2000);
		asm3.initFruitSeller(80, 40000, 3000);
		
		// 사과를 구매하는 행위
		System.out.println("=== 사과장수1 ===");
		fb.buyApple(asm, 13000);
		System.out.println("=== 사과장수2 ===");
		fb.buyApple(asm2, 10000);
		System.out.println("=== 사과장수3 ===");
		fb.buyApple(asm3, 5000);
		System.out.println("== 구매자 결과==");
		fb.afterShopping();
	}

}
