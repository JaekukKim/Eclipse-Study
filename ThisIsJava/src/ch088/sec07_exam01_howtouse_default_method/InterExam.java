package ch088.sec07_exam01_howtouse_default_method;

public class InterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterM im = new InterA(); // InterM의 변수 선언 후 객체생성.
		im.method1();
		
		InterM im1 = new InterB();
		im1.method1();
		im1.method2();
		// 디폴트 메소드가 추가된 InterB에서 메소드를 호출하였다. 위와 매우 큰 차이점은 추상메소드라면 위에도 메소드 12가 추가됫어야 하는데 아니다!!
		
	}

}
