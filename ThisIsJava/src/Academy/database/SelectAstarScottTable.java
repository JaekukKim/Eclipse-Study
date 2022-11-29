package Academy.database;

public class SelectAstarScottTable {
	public static void main(String[] args) {
		
		int choice1 = 0; // 선택한 테이블 번호를 저장할 변수.

		while (true) {
			// 테이블을 선택할 수 있게 메뉴를 보여준다.
			ScottManager.showMenu1();

			choice1 = ScottManager.keyboard.nextInt();
			ScottManager.keyboard.nextLine();
			// 위 두줄은 쌍이라고 생각하자. int값은 줄바꿈이 안된다. 줄바꿈 명령어라고 생각.

			switch (choice1) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1:
				ScottManager.subMenu(choice1);
				break;
			case 2:
				ScottManager.subMenu(choice1);
				break;
			case 3:
				ScottManager.subMenu(choice1);
				break;
			default:
				System.out.println("괜히 이상한거 누르지마세여");
				break;
			}
		}
	}
}
