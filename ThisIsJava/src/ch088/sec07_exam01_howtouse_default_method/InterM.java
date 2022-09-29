package ch088.sec07_exam01_howtouse_default_method;

public interface InterM {
	public void method1();
	/*
	 * public void method2(); 갑자기 이렇게 새로운 메소드를 추가하면 다른 구현클래스에서 에러가난다. 구현클래스가 적을시에는
	 * 일일히 수정하면 되지만 그렇지 않다면 매우 힘든 작업이 되기때문에 디폴트 메소드가 필요하다.
	 */
	public default void method2() {
		System.out.println("InterM-default_method2 실행.");
	}

}
