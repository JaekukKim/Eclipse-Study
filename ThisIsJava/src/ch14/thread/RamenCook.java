package ch14.thread;

public class RamenCook implements Runnable{
	// 처음 라면의 갯수.
	private int ramenCount;
	// 각 라면을 끓일 버너를 배열로 지정.
	private String[] burners = {"_","_","_","_"};
	
	// 초기값을 라면의 갯수로 지정, 생성자 이용
	public RamenCook(int ramenCount) {
		this.ramenCount = ramenCount;
	}
	
	// 
	@Override
	public void run() {
		while (ramenCount > 0) {
			synchronized (this) {
				ramenCount--;
				System.out.println("라면의 총 갯수 : " + ramenCount + "개 남았습니다.");
				
			}
			for (int i = 0; i < burners.length; i++) {
				if (!burners[i].equals("_")) {
					continue;
					
				}
				// 라면이 조리 될 동안 버너를 막 건들면 안된다, synchronized를 이용해 동기화 시키면 작업이 완료될 때 까지
				// 해당 코드는 다른 쓰레드에서 관여 할 수 없다.
				synchronized (this) {
					burners[i] = Thread.currentThread().getName();
					System.out.println(Thread.currentThread().getName() + ": 조리 시작 [ "+ (i+1) + " ] 번 버너 ON");
					showBurners();
					
				}
				try {
					Thread.sleep(2000);
					// 쓰레드의 대기시간을 2000ms로 잡아준다 (2초)
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				synchronized (this) {
					burners[i] = "_";
					System.out.println(Thread.currentThread().getName() + ": [ " + (i+1) + " ] 번 버너 OFF");
					showBurners();
					System.out.println(Thread.currentThread().getName() + " 조리 완료. \n");
			}
				
			
				
			}
			try {
				Thread.sleep(Math.round(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	private void showBurners() {
		String burner = "";
		for (int i = 0; i < burners.length; i++) {
			burner += ("\t  " + burners[i] + "\n");
		}
		System.out.println(burner);
	}
}
