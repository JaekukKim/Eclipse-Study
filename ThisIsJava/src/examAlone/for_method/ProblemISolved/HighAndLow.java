package examAlone.for_method.ProblemISolved;

import java.util.Scanner;

public class HighAndLow<T> {
	public static void main(String[] args) {
		// 1~100사이의 임의의 정수를 맞추는 게임
		// Math.random() 메소드 사용.
		// 1~100사이의 임의의 정수를 추출한다.

		int in = 0; // 사용자가 입력한 값을 저장하는 변수.
		int start = 0; // 게임시작을 알리기 위한 변수.

		Scanner sc = new Scanner(System.in);
		// **** 입력값을 받기 위한 scanner 클래스 선언.

		do { // **** 첫번째 do-while문
			int ans = (int) (Math.random() * 100) + 1;
			int count = 0; // 시도한 횟수를 저정하는 변수.

			System.out.println("============");
			System.out.println("0. 게임종료");
			System.out.println("1. 게임시작");
			System.out.println("============");
			System.out.println();
			System.out.println("게임 시작을 원하시면 1 을 입력해주세요");

			in = sc.nextInt();

			if (in == 0) {
				System.out.println("게임을 종료합니다.");
				break; // 프로그램을 멈춤, (종료가 아니다. 종료는 system.exit(); 메소드이다.

			} else if (in != 1) {
				System.out.println("잘못된 번호를 입력하셨습니다. \n다시 선택하십시오.");
				continue; // 잘못된 번호가 입력되면 처음으로 돌아감.

			} else {
				System.out.println("게임을 시작합니다.");
				System.out.println();
			}

			do { // 게임을 돌리기 위한 두번째 do-while문
				count++;
				System.out.print("1과 100 사이의 임의 정수를 입력하세요 : ");
				in = sc.nextInt();
				if (ans > in) {
					System.out.println("입력값 : " + in + " 이 임의의 수 보다 작습니다.");
					System.out.println();
				} else {
					System.out.println("입력값 : " + in + " 이 임의의 수 보다 큽니다.");
					System.out.println();
				}
				if (ans == in) {
					System.out.println("일치합니다");
					System.out.println("입력값 : " + in + " , " + "출력값 : " + ans);
					System.out.println("맞출때까지 시도한 횟수 : " + count);
					break;

				}

			} while (true);
		} while (start != 0);
		sc.close(); // scanner 클래스 같은 경우는 gc(가비지컬렉터)가 자동으로 삭제해주지 않는다, 그래서 수동으로 삭제해줘야 한다.
	}
}// **** do-while문의 while 조건문 설정이 중요하다.