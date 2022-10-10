package ch13.sec04.exam02_generic_method;

public class Pare<K,V> {
	private K key;
	private V value;
	
	// Source -> generate getter and setter 는 무적이자 신이다. 자주자주쓰자.
	
	public Pare(K key, V value) {
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}

}
