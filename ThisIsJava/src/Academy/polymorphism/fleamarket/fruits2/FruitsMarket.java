package Academy.polymorphism.fleamarket.fruits2;

public class FruitsMarket {
	public static void main(String[] args) {
		FruitsBuyer fb = new FruitsBuyer(50000);
		//구매자
		
		AppleSalesMan asm = new AppleSalesMan(100);
		AppleSalesMan asm2 = new AppleSalesMan(100);
		AppleSalesMan asm3 = new AppleSalesMan(100);
		// 사과장수 1,2,3
		
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
