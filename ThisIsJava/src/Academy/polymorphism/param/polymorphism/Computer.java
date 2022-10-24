package Academy.polymorphism.param.polymorphism;

public class Computer extends Product{
	
	public Computer () {
		
		// 부모생성자의 매개변수에 매개값을 넘겨준다 super(매개값); 이런식임
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
	

}
