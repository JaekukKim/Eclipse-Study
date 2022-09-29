package ch088.sec02.exam03_multi_implements_class;

public class RCExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ST rc = new ST(); // 호출 후 대입.
		
		//RemoteControl에 있는 추상메소드를 실체메소드로 구현한 메소드 호출
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(6);
		
		ST rc2 = new ST();
		
		//Searchable에 있는 
		rc2.search("123123");
	

	}

}
