package ch088.sec07_exam02_default_method_extends;

public interface ParentsInterface {
	void method1();
	
	public default void method2() {
		//실행문 작성~
		System.out.println("ParentInterface_method2 실행.");
	}

}
