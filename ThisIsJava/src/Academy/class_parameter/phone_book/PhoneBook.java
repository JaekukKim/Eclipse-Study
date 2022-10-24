package Academy.class_parameter.phone_book;

public class PhoneBook {
	public static void main(String[] args) {
		// 전화번호 관리 객체 생성.
		PhoneBookManager manager = new PhoneBookManager();
		int choice = 0; // 지역변수 생성. 초기화 해줘야함.
		boolean onOff = true;

		while (onOff == true) {
			ManuViewer.showMenu();

			choice = ManuViewer.keyboard.nextInt();
			switch (choice) {
			case 1:
				manager.inputData();
				break;
			case 2:
				manager.searchData();
				break;
			case 3:
				manager.deleteData();
				break;
			case 4:
				manager.wholeDataDisplay();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				onOff = false;
				// ******가장 가까운 반복문을 벗어나게 된다.
				return;
				
			default:
				System.out.println("번호를 다시 선택해주세요.");

			}
		}
	}

}
