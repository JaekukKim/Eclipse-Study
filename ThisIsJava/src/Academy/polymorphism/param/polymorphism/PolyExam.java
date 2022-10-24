package Academy.polymorphism.param.polymorphism;

public class PolyExam {
	public static void main(String[] args) {
		
		// 매장에 물건들을 깔아버린다. -> 객체생성
		Tv tv = new Tv();
		Computer com = new Computer();
		Phone ph = new Phone();
		
		// 물건 구매자 등장
		AnotherBuyer ab = new AnotherBuyer(1000);
		
		ab.buy(ph);
		ab.buy(com);
		ab.buy(tv);
		ab.summary();
		
		System.out.println();
		
		// 다른 구매자 등장
		Buyer buy = new Buyer(1500);
		
		buy.buy(ph);
		buy.buy(com);
		buy.buy(tv);
		buy.summary();
		
		
	}

}
