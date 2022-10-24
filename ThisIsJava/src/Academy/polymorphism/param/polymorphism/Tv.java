package Academy.polymorphism.param.polymorphism;

public class Tv extends Product{
	
	public Tv() {
		// 부모클래스의 생성자 호출.
		
		super(100); // Tv의 가격을 설정.
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
	

}
