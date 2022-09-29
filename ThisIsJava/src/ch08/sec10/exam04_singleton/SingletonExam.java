package ch08.sec10.exam04_singleton;

public class SingletonExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Singleton obj1 = new Singleton();
		//private 접근 권한이기 때문에 컴파일 오류가 남.
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		//정적 메소드 호출 방식으로 싱글톤 객체를 얻음.
		
		if (obj1 == obj2) {
			System.out.println("같은 객체입니다");
			
		}
		else {
			System.out.println("다른 객체입니다.");
		}
		

	}

}
