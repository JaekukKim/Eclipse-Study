package Academy.polymorphism.fleamarket.fruits2;

public class FruitsBuyer {
	int money;
	int fruitBasket = 0;
	
	public FruitsBuyer(int money) {
		this.money = money;
	}
	
	// 사과장수에게 돈을 주고 사과를 건네받는다. (매개변수 : 사과장수 클래스 타입, int타입 돈)
	public void buyApple(AppleSalesMan man, int money) {
		this.money -= (money/man.APPLE_PRICE) * man.APPLE_PRICE;
		// 애매한 단위의 금액을 잘라버리는 작업이다. 수학적으로 보면 money랑 같아보이지만 프로그래밍에선 / 연산자의 정해진 역할이 있어 다르게 나온다.
		fruitBasket += man.saleApple(money);
	}
	
	// 구매현황 알아보기
	public void afterShopping() {
		System.out.println("구매한 사과의 총 갯수는 : " + fruitBasket);
		System.out.println("남은 금액은 : " + money);
	}

}
