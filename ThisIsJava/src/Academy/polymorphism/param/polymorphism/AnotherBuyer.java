package Academy.polymorphism.param.polymorphism;

public class AnotherBuyer {
	// 구매자끼리 경쟁붙이기
	
	int myMoney = 0;
	int bonusPoint = 0;
	
	public AnotherBuyer(int totalMoney) {
		this.myMoney = totalMoney;
	}
	
	Product[] item = new Product[10]; // 구매한 제품을 저장하기 위한 배열
	
	int cnt = 0; // Product 배열에 사용될 카운팅 변수, 제품의 갯수를 나타내준다고 생각하면 된다.
	
	public void buy (Product product) {
		if (myMoney < product.price) {
			System.out.println("돈이 없어서 " + product + " 를 못사용");
			return;
		}
		myMoney -= product.price; // 가지고있는 돈에서 구매한 돈을 뺀다.
		bonusPoint += product.bonusPoint;
		item[cnt++] = product; // 구매한 제품을 product 배열에 저장한다.
		
		System.out.println(product + " 제품 구매 완료.");
	}
	
	void summary() { // 구매자의 상황을 보여준다.
		int sum = 0; // 구매하는데 사용된 금액의 합계
		String itemList = ""; // 구매한 물품 목록
		int bonusSum = 0;
		
		// 반복문을 사용하여 구매한 물품의 총 가격과 목록을 만든다
		for (int i = 0; i < item.length; i++) {
			if (item[i]==null) {
				break;
			}
			sum += item[i].price; // item배열에 저장되어있는 객체의 가격을 불러와 저장한다.
			itemList += item[i] + ", "; // item배열에 저장되어있는 객체의 이름을 저장한다.
			bonusSum += item[i].bonusPoint; // item배열에 저장되어 있는 객체의 보너스 포인트를 불러와 저장한다.
		}
		
		System.out.println("제품을 구매하는데 쓴 돈은 총 : " + sum + " 만원.");
		System.out.println("구매한 제품의 목록은 " + itemList + " 입니다.");
		System.out.println("누적된 보너스 포인트는 " + bonusSum + " 만원 입니다.");
		
		System.out.println("남은 돈 : " + this.myMoney);
	}

}
