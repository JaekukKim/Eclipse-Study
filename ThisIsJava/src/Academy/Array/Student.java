package Academy.Array;

public class Student {
	// 아래와 같은 멤버 변수를 가지고 있는 student 클래스를 만드세용
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int mat;

	// getTotal
	// 국어영어수학점수를 모두 더해서 반환

	// getAvg
	// 총점의 평균을 구함

	public Student() {

	}

	public void StudentInit(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		System.out.println("학생의 이름은 ? : " + this.name);
		System.out.println("학생의 반은 ? : " + this.ban);
		System.out.println("학생의 번호는 ? : " + this.no);

	}

	public int getTotal(int kor, int eng, int mat) {
		int result = 0;
		result = kor + eng + mat;
		System.out.println("점수의 총 합은 ? : " + result);
		return result;

	}

	public int getAvg(int kor, int eng, int mat) {
		int result = 0;
		result = (kor + eng + mat) / 3;
		System.out.println("점수의 평균은 ? : " + result);
		return result;
	}

}