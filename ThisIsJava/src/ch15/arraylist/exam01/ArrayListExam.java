package ch15.arraylist.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
	public static void main(String[] args) {
		List<Board> list  = new ArrayList<>();
		
		
		// 객체 저장
		list.add(new Board("주제1", "내용1", "글쓴이1"));
		list.add(new Board("주제2", "내용2", "글쓴이2"));
		list.add(new Board("주제3", "내용3", "글쓴이3"));
		list.add(new Board("주제4", "내용4", "글쓴이4"));
		
		// 저장된 객체 "수" 불러오기
		int size = list.size();
		System.out.println("저장된 객체 수 : " + size);
		
		System.out.println("==특정 인덱스의 객체 가져오기==");
		Board board = list.get(3);
		System.out.println(board.getsubject()+ "\t" + board.getContent() + "\t" + board.getWriter());
		
		System.out.println("==모든 객체를 하나씩 가져오기==");
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b.getsubject() +  b.getContent() +  b.getWriter());
		}
		
		System.out.println("==객체 삭제하기==");
		list.remove(1); // 1번 인덱스의 객체를 삭제하면 2번 인덱스에 있는 객체가 1번으로 밀려온다.
		list.remove(1); // 거기서 다시 한번 1번 인덱스의 객체를 삭제하면 밀려온 2번 인덱스가 1번 객체에 들어간게 삭제된다.
		
		System.out.println("==향상된 for문으로 객체 하나씩 가져오기==");
		for (Board b : list) {
			System.out.println(b.getsubject() +  b.getContent() +  b.getWriter());
		}
	}
	
	

}
