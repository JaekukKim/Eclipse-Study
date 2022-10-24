package Academy.polymorphism.param.polymorphism;

public class Buyer {
	int myMoney;
	int bonusPoint = 0;
	
	Buyer (int totalMoney) {
		this.myMoney = totalMoney;
	}
	
	// Product 타입이 아니면 각 제품에 해당하는 메소드를 별도로 만들어야 한다.
	void buy(Product product) {
		if (myMoney < product.price) { // 보유 금액이 제품의 가격보다 적으면
			System.out.println(product + " 이거 못사세요.");
			return;
		}
		myMoney -= product.price; // 내 돈에서 물건가격 뺌 = 판매자에게 돈을 주는 행위.
		bonusPoint += product.bonusPoint;
		
		System.out.println(product.price + " 원 결제 해드리겠습니다. 적립 포인트는 " + product.bonusPoint + " 원 입니다.");
		System.out.println("아유 감사합니다 고객님 " + product + " 상품배송은 안전하게 해드리겠습니다.");
		
	}
	
	void summary() {
		System.out.println();
		System.out.println("제품을 구매하는데 쓴 돈 : " + this.bonusPoint*10);
		System.out.println("남은 돈 : " + this.myMoney);
		System.out.println("보너스 포인트 : " + this.bonusPoint);
		System.out.println();
	
	}

}
