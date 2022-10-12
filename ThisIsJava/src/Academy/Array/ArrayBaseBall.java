package Academy.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBaseBall {
	public static void main(String[] args) {

		// 야구게임
		int[] comNum = new int[3]; // 컴퓨터가 추출한 문제
		int[] myNum = new int[3]; // 내가찍은 숫자
		int counter = 0; // 몇번만에 맞추었는지
		int num = 0; // 내가 찍은 숫자를 저장.
		boolean randomBall = true;

		Scanner sc = new Scanner(System.in);
		// 스캐너 같은 경우는 메모리 누수를 방지하기 위하여 close()메소드를 사용하여 닫아주어야 한다.
		
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 9) + 1;
			if (i > 0) {
				for (int j = 0; j < i; j++) {
					if (comNum[j] == comNum[i]) {
						i--;
						break;
					}
				}
			}
		}

		System.out.println("===== 컴퓨터의 숫자설정이 완료되었습니다 =====");

		while (randomBall) {
			int strike = 0; // 숫자와 자리가 일치하면 일치함을 카운트 해주는 변수 생성.
			int ball = 0; // 숫자만 일치하면 일치함을 카운트 해주는 변수 생성.
			int out = 0;
			while (randomBall) {
				counter++;
				System.out.println("==" + counter + " 회차를 시작합니다. ==");
				System.out.println("== 3자리 숫자를 입력해 주세요 ==");
				System.out.println();
				
				for (int i = 0; i < myNum.length; i++) {
					System.out.println(i + 1 + " 번째 숫자를 입력해 주세요.");
					try {
						num = sc.nextInt();
						myNum[i] = num;
						if (num < 1 || num > 9) {
							System.out.println("잘못된 숫자를 입력하셨습니다.");
							i--;
							randomBall = false;
						} 
					} catch (Exception e) {
						System.out.println("잘못된 값을 입력했습니다.");
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					}
				}
				System.out.println("입력하신 숫자는 : " + Arrays.toString(myNum) + " 입니다.");
				System.out.println();
				System.out.println("== 숫자입력이 완료되었습니다. 지옥의 야구게임을 시작합니다. ==");
				System.out.println();
				randomBall = false;
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; ++j) {
					if (comNum[i] == myNum[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}

					}
				}

			}
			// 맞춘 개수와 틀린 개수를 보여준다.
			System.out.println(strike + "S " + ball + "B "+ out + "O" +"입니다.");

			// 3스트라이크면 게임 종료
			if (strike == 3) {
				System.out.println("모든 숫자를 맞추셨습니다.");
				System.out.println("지옥의 야구게임이 종료되었습니다.");
				randomBall = false;
			} else {
				System.out.println("아쉽습니다. 다 맞추기 전까진 집에 못갑니다.\n");
				strike = 0;
				ball = 0;
				randomBall = true;
			}
		}
		sc.close();
	}

}
