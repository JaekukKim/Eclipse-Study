package ch13.sec04.exam01_generic_method;

public class Box <T>{
	private T t;
	
	public void set (T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	

}
