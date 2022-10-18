package Academy.Array.phone_book;

public class PhoneBookManager {
	// 입력, 조회, 삭제 기능을 만들 클래스 선언
	
	final int MAX_CNT = 100;
	// PhoneInfo 클래스를 참조하는 참조변수를 담는 배열 생성.
	PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	// 이 부분이 참 중요한거같다. 보통 프로젝트를 할때는 "클래스타입"의 참조가 굉장히 많은데 이 부분도 그렇게 선언이 되었다.
	// 확실히 블랙잭이란 나만의 미니프로젝트를 한번 해보고 나니 뭔가 좀 보이는거같다.

	int curCnt = 0; // 배열을 관리하는 변수 생성.

	public void inputData() {
		PhoneInfo pi = new PhoneInfo();

		System.out.println("사용자 정보 입력을 시작합니다.");
		System.out.println("이름을 입력해 주세요.");
		pi.setName(ManuViewer.keyboard.next());
		System.out.println("전화번호를 입력해 주세요");
		pi.setPhoneNumber(ManuViewer.keyboard.next());
		System.out.println("생년월일을 입력해 주세요.");
		pi.setBirthDay(ManuViewer.keyboard.next());

		infoStorage[curCnt++] = new PhoneInfo(pi.getName(), pi.getPhoneNumber(), pi.getBirthDay());
		System.out.println("입력된 정보가 " + curCnt + " 에 저장 되었습니다.\n데이터입력이 완료되었습니다.");

	}

	public void wholeDataDisplay() {
		System.out.println("모든 전화번호 정보를 출력합니다.");

		for (int idx = 0; idx < curCnt; idx++) {
			infoStorage[idx].showPhoneNum();
		}

		// try-catch 를 이용하여 null값 예외 떠넘기기
		// 위나 아래나 메모리 효율은 비슷하다. 난 근데 위에게(강사님의 방식) 더 맘에든다.

//			try {
//				for (int i = 0; i < infoStorage.length; i++) {
//					// infoStorage는 PhoneInfo의 클래스타입으로 리턴되는 배열이다.
//					// infoStorage는 PhoneInfo의 객체의 참조변수들이 저장되어 있다. 값이 정해진 변수가 저장되는게 절대로 아니다.
//					// PhoneInfo객체에서 만들어진 항목들(또다른객체)의 "주솟값"이 저장되는것이다.
//					infoStorage[i].showPhoneNum();
//				if (infoStorage[i] == null) {
//					System.out.println("");
//				}
//			}
//				
//			} catch (NullPointerException e) {
//				System.out.println("저장되지 않은 정보는 출력할 수 없습니다. 정보를 저장해주세요.\n");
//			}

		System.out.println("모든 번호 정보가 출력되었습니다.\n");
	}

	// 이름으로 전화정보 검색
	public void searchData() {
		System.out.println("이름으로 정보를 검색합니다.");
		System.out.println("이름을 입력 해 주세요.");
		String name = ManuViewer.keyboard.next();

		int dataIdx = searchIndex(name);
		if (dataIdx < 0) {
			System.out.println("결과를 찾지 못하였습니다.");
		} else {
			int idx = dataIdx + 1;
			System.out.println("=> " + name + " 은 " + idx + " 번째에 저장되어 있습니다.");
		}
	}

	public void deleteData() {
		System.out.println("이름으로 삭제할 데이터를 검색합니다.");
		System.out.println("이름을 입력 해 주세요.");
		String name = ManuViewer.keyboard.next();

		// 일단 이름에 해당하는 방번호를 검색한다.
		int dataIdx = searchIndex(name);

		// 이름에 해당하는 방 번호가 없는 경우 if
		// 이름에 해당하는 방 번호가 있는경우 찾아낸 뒤 삭제한다. else
		if (dataIdx < 0) {
			System.out.println("결과를 찾지 못하였습니다.");
		} else {
			System.out.println("결과를 찾았습니다. 데이터를 삭제하시겠습니까?");
			System.out.println("삭제를 원하시면 1번을, 아니면 2번을 눌러주세요.");
			int choice = ManuViewer.keyboard.nextInt();
			if (choice == 1) {
				for (int idx = dataIdx; idx < curCnt; idx++) {
					infoStorage[idx] = infoStorage[idx+1];
				}
				curCnt--;
				System.out.println("데이터 삭제를 완료하였습니다.");
				
			} else {
				System.out.println("데이터를 보존한 상태로 프로그램을 종료합니다.");
				System.exit(1);
			}
		}

	}

	// 이름으로 검색한 위치 정보 알아내기
	private int searchIndex(String name) {
		for (int idx = 0; idx < curCnt; idx++) { // 데이터가 있는 곳 까지만 검색 한 후 위치를 찾아낸다.

			PhoneInfo curInfo = infoStorage[idx];

			// curInfo에 infoStorage[idx] 자체가 저장되어 있는것이므로 curInfo는 infoStorage[idx번째] 주솟값 그
			// 자체이다.
			if (curInfo.getName().compareTo(name) == 0) { // "내용자체"가 같은지를 비교.

				// curInfo.getName()은 infoStorage[idx번째]에 저장되어 있는 이름을 호출하는 것이다.
				// 그리고 그 이름을 입력된 name(퍼런글씨)과 비교하는것이다.
				// compareTo는 문자열을 비교하여 0이면 같은 결과라는 뜻이다.
				return idx;
			}

		}
		return -1;

	}

}
