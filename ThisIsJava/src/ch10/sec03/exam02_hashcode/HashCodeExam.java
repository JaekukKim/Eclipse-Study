package ch10.sec03.exam02_hashcode;

public class HashCodeExam {
	public static void main(String[] args) {
		HashCode hs1 = new HashCode(1, "재국");
		HashCode hs2 = new HashCode(1, "재국");
		
		if (hs1.hashCode() == hs2.hashCode()) {
			if (hs1.equals(hs2)) {
				System.out.println("논리적으로 동등한 객체입니다");
				
			} else {
				System.out.println("데이터가 다르므로 논리적으로 동등한 객체가 아닙니다");
			} 
			
		} else {
			System.out.println("해시코드가 서로 다릅니다.");
		}
		System.out.println("hs1의 해시코드 : " + hs1.hashCode() + ", hs2의 해시코드 : " + hs2.hashCode());
	}

}
