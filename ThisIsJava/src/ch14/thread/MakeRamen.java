package ch14.thread;

public class MakeRamen {
	public static void main(String[] args) throws Exception{

		RamenCook ramenCook = new RamenCook(10);
		// 객체가 생성됨과 동시에 괄호 안에 있는 (라면의갯수)를 각 버너에서 끓임.
		Thread th = new Thread(ramenCook, "진라면");
		Thread th2 = new Thread(ramenCook, "신라면");
		Thread th3 = new Thread(ramenCook, "스낵면");
		Thread th4 = new Thread(ramenCook, "불닭볶음면");
		
		th.start();
		th2.start();
		th3.start();
		th4.start();

		
	}

}
