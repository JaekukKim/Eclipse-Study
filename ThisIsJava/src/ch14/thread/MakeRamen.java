package ch14.thread;

public class MakeRamen {
	public static void main(String[] args) throws Exception{

		RamenCook ramenCook = new RamenCook(10);
		// 쓰레드 객체 (라면) 생성.
		// 쓰레드 객체는 Thread(Runnable target, String name) 식으로 생성된다.
		Thread th = new Thread(ramenCook, "진라면");
		Thread th2 = new Thread(ramenCook, "신라면");
		Thread th3 = new Thread(ramenCook, "스낵면");
		Thread th4 = new Thread(ramenCook, "불닭볶음면");
		
		// 쓰레드 실행! (라면끓이기 시작)
		th.start();
		th2.start();
		th3.start();
		th4.start();

		
	}

}
