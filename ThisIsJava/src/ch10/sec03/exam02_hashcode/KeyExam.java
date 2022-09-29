package ch10.sec03.exam02_hashcode;

import java.util.HashMap;

public class KeyExam {
	public static void main(String[] args) {
		
		//hashmap 선언. // HashMap<키타입,데이터타입> 변수명 = new HashMap<키타입,데이터타입>(); 으로 구성.
		//어떠한 값을 저장 할 때 key객체를 가지고 저장. 저장 할 때 key와 동일한 데이터를 가지고 있는 동등 객체를 가지고
		//어떠한 값을 얻는다. key가 같다면 얻을 수 있다, 다르다면 hash맵은 데이터를 주지 않는다.
		//key가 같을 경우에만 저장되어있는 key의 데이터를 산출한다.
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//<키타입, 데이터 타입> 으로 제네릭 타입 구성.
		hashMap.put(new Key(1), "김재국"); // hashmap은 put을 이용하여 넣을 수 있다. new를 활용하여 주입 가능
		
		
		//위에 있는 new key(1)에서 해쉬코드 출력이 한번 됬고
		//아래에 있는 똑같은데서 해쉬코드 출력이 한번 더 되었다.
		
		
		String str = hashMap.get(new Key(1)); // 값을 찾아올때는 get메소드를 이용하여 찾아온다.
		System.out.println(str);
	}

}
