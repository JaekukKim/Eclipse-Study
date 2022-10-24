package Academy.polymorphism.fleamarket.fruits2;

public class AppleSalesMan {
	int numOfApple; // 사과 보유갯수
	int myMoney = 0;
	final int APPLE_PRICE = 1000; // 사과 판매금액

	public AppleSalesMan(int numOfApple) {
		// 사과 보유갯수는 생성자 초기화로 지정
		this.numOfApple = numOfApple;
	}

	// 사과장수는 사과를 팔아야한다. 돈을 받고 (매개변수)
	// [1]사과를 주고 // [2]준 사과는 보유갯수에서 깎이고 // [3]깎인만큼 개당 사과값만큼 돈이들어온다.

	public int saleApple(int money) {
		// 이 메소드는 사과를 파는데에만 집중하는 메소드여야만 한다.
		// 사과를 팔때는 기존에 있던 사과의 갯수과 남은 사과의 갯수만 중요할뿐이지
		// 돈을 받는 행위는 사과의 갯수와 전혀 무관하다.
		// 돈을 받는 행위는 다른 메소드로 만들도록 하자.
		
		int num = money / APPLE_PRICE;
		// 받은 금액에 해당하는 사과의 갯수를 구하고.
		
		this.myMoney = this.makeMoney(money);
		// 돈을 받는다. (메소드 인 메소드) -> 의도치 않았지만 받음과 동시에 상태출력.
		
		
		this.numOfApple -= num;
		return num;
	}

	
	private int makeMoney(int money) {
		// 돈을 버는 행위의 메소드이다. 단순하게 받은 돈만 추가시켜주면 된다.
		this.myMoney+=money;
		this.numOfApple = this.divisorNumOfApple(money);
		System.out.println("현재 자산은 : " + this.myMoney + " 원 입니다");
		return myMoney;
	}
	
	private int divisorNumOfApple(int money) {
		this.numOfApple -= money/APPLE_PRICE;
		System.out.println("남은 사과의 갯수는 : " + this.numOfApple + " 개 입니다.");
		return numOfApple;
	}
}
