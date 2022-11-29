package ch15.hash.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		// 키와 값이 주어졌을때 값을 리턴하는 예제를 만들어보자.
		// 키와 값이라는 개념이 주어졌으니 hashmap을 사용하여야 한다.
		// 키는 문자열, 값은 정수타입으로.

		// 이름을 키로 점수를 값으로 저장하여 키를 호출하면 값을 출력하게 만들어보자.
		Map<String, Integer> result = new HashMap<>();
		// 제네릭에서의 타입 파라미터의 참조타입은 int같은게 못들어간다. 하지만 int와 char만 다르니 쉽게 외울 수 있다.

		result.put("재국", 90);
		result.put("익명1", 95);
		result.put("사람", 82);
		result.put("학생", 77);
		result.put("재국", 95); // 키가 같다면 마지막에 저장된 값이 덮어 씌워진다.

		// 중복되어 저장된 부분이 있으니 총 크기는 4가 나올것이다.
		System.out.println("저장된 용량은? : " + result.size());

		// 이제 키 "만을" 이용하여 값을 얻어보자.
		// 키를 이용하여 값얻는 메소드는 참조변수.get("키"); 이다.
		// "사람"이라는 키를 주고 값을 받아와보자.
		System.out.println("사람의 점수는? : " + result.get("사람"));

		// [잠깐] 중복된 키에 값이 새롭게 들어오면 정말 덮어씌워지는지(마지막 값이 저장되는지) 확인해보자.
		if (result.get("재국") == 95) {
			System.out.println("재국의 점수는 마지막의 들어온 95라는 값으로 저장이 되었네요!");
		} else {
			System.out.println("저장이 안된거 같은걸요? 점수가 그대로 90이에요!");
		}

		// iterator메소드를 사용하여 반복자를 얻어 객체를 하나씩 가져와보자.
		// boolean : hasNext() , collection :next() , void : remove() 메소드를 추가적으로 사용가능
		
		Set <String> keyOfSet = result.keySet();
		// 모든 키를 set 객체에 담아 리턴하는 메소드이다. result의 모든 key가 keyset에 담김.
		Iterator<String> iter = keyOfSet.iterator();
		// Iterator<타입파라미터> 는 set객체의 반복자를 얻는 과정의 코드이다. result.keySet()과 타입 파라미터가 같아야 반복자를 얻을 수 있다.
		
		while (iter.hasNext()) {
			// hasnext는 boolean타입이다. 만약 false면 while문을 빠져나간다. 메소드 별 리턴타입도 반드시 알아두어야 한다.
			// 리턴타입따윈 관심없고 그때그때 알아내고 싶다면 영어공부하자.
			// Set은 컬렉션이다. 그에 반면 map은 컬렉션이 아니다. 위의 반복자는 set객체로 생성한거니 리턴타입이 컬렉션인 next()메소드 사용이 가능하다.
			String key = iter.next();
			Integer value = result.get(key);
			
			System.out.println("key는? : " + key + "\t" + "Value는? : " + value);

		}
		
		// 이참에 entry도 한번 얻어보자.
		
		Set <Entry <String,Integer>> entryset = result.entrySet();
		// 엔트리 임포트는 자바유틸로 해주어야한다.
		// 그리고 위와 마찬가지로 반복자 생성.
		Iterator<Entry<String,Integer>> entryiter=entryset.iterator();

		// boolean type hasNext
		while (entryiter.hasNext()) {
			// result의 엔트리(키,값 쌍)를 하나씩 가져와 entry에 저장한다.
			Entry<String,Integer> entry = entryiter.next();
			// Entry 부분은 반복문 밖에 사용해주면 안된다. 반복문 밖에 선언해주면 엔트리의 0번째 값이 무한정 출력된다, 반복문 밖에 있는 값은 처음부터 시작되기 때문.
			// 그러므로 안쪽에 선언해주어야 한다. 안쪽에 선언 시 hasNext()로 판별 후 next()로 다음 객체를 가져오기 때문이다.
			
			String entryKey = entry.getKey();
			Integer entryValue = entry.getValue();
			
			System.out.println("result의 key는? : " + entryKey + "\t" + "Value는? : " + entryValue);
		}
		
	}
}
