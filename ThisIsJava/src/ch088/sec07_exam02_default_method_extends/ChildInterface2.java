package ch088.sec07_exam02_default_method_extends;

public interface ChildInterface2 extends ParentsInterface{
	public void method3();
	
	@Override
	default void method2() { // 인터페이스 내부라 디폴트키워드 삭제하지 말것.
		System.out.println("ch2의 overriding method2 실행");
	}

}
