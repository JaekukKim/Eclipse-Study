package ch088.sec02.exam02_noname_implements_class;

public class RcExam {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() { // 인터페이스의 추상메소드들을 실체메소드로 모두 선언해줘야함.
			
			//여기 내부에 사용된 필드와 메소드는 이 블럭(중괄호)내부에서만 사용 할 수 있다. rc.메소드명(); 이걸로 호출이 안됨.
			//저장 할 시 클래스이름$번호.class식으로 저장이 된다.
			
			
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다");
				
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
				
			}

			@Override
			public void setVolume(int volume) {
				
				
			}
			
		}; // 여기 세미콜론은 익명 클래스인 인터페이스를 구현하는데 반드시 필요함.
	}

}
