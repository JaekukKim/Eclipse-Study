package Academy.class_parameter.phone_book;

import java.util.Scanner;

public class ManuViewer {
	// 메뉴를 보여주는 클래스 선언
	// static은 메모리영역에서 관리되어 프로그램이 실행 되자마자 같이 실행된다.
	public static Scanner keyboard = new Scanner(System.in);

	public static void showMenu() {
		System.out.println("\n원하시는 메뉴의 번호를 입력해주세요.");
		System.out.println("0. 프로그램 종료\n1. 데이터입력\n2. 데이터검색\n3. 데이터삭제\n4. 모든자료조회");
		System.out.println("입력 번호 : ");
		

	}

}
