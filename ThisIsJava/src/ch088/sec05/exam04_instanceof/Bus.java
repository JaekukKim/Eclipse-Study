package ch088.sec05.exam04_instanceof;

public class Bus implements Vehicle{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
		
	}
	
	void check() {
		System.out.println("카드가 체크되었습니다.");
	}

}
