package ch08.sec07.Korean;

public class KoreanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Korean K1 = new Korean("김재국","921103-1111111");
		Korean K2 = new Korean("머저리","111111-1111111");
		
		System.out.println("국적 : " + K1.nation);
		System.out.println("이름 : " + K1.name);
		System.out.println("주민번호 : " + K1.ssn);
		
		System.out.println();
		
		System.out.println("국적 : " + K2.nation);
		System.out.println("이름 : " + K2.name);
		System.out.println("주민번호 : " + K2.ssn);
		
	
	}

}
