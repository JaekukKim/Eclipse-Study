package ch15.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam {
	public static void main(String[] args) {
		// LinkedList 와 ArrayList의 사용방식은 똑같다. 하지만 서로 삽입과 삭제하는 방식이 다르므로
		// 이번에는 두 리스트간의 사용 시간을 알아보려고 한다.
		
		// LinkedList같은 경우에는 삽입과 삭제시 인덱스 양쪽의 인덱스와 새로운 "링크"를 연결 및 해제를 하는 방식으로 돌아가고
		// ArrayList같은 경우엔 삽입과 삭제시 인덱스가 하나하나씩 "밀려나가지거나" "당겨지거나" 하면서 돌아간다.
		// 즉 빈번한 삭제와 삽입이 일어나는 경우에는 LinkedList를 사용하는것이 훨씬 더 효율적이다.
		
		List<String> arraylist = new ArrayList<>();
		List<String> linkedlist = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		System.out.println("==ArrayList 소요시간==");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			arraylist.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은? : " + (endTime - startTime) + " ns");
		
		System.out.println("==LinkedList 소요시간==");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			linkedlist.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간은? : " + (endTime - startTime) + " ns");
	}

}
