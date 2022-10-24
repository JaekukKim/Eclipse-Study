package Academy.polymorphism.param.polymorphism;

public abstract class Product {
	int price; // 공통으로 표시될 가격
	int bonusPoint; // 구매시 제공하는 포인트
	
	public Product() {
		this(0,0);
	}
	
	public Product(int price, int bonusPoint) {
		this.price = price;
		this.bonusPoint = bonusPoint;
	}
	
	public Product(int price){
		this.price = price;
		this.bonusPoint = price/10;
		
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}
