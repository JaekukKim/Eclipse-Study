package Academy.Array;

import java.util.Scanner;

public class StudentExam {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 정보를 기입해주세요.");
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println("학생의 이름은?");
				st.name = sc.nextLine();
			} else if (i == 1) {
				System.out.println("학생의 반은?");
				st.ban = sc.nextInt();

			} else {
				System.out.println("학생번호");
				st.no = sc.nextInt();
			}

		}

		System.out.println("학생의 점수를 기입해주세요");
		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				System.out.println("국어점수를 기입해주세요");
				st.kor = sc.nextInt();
			} else if (i == 1) {
				System.out.println("영어점수를 기입해주세요");
				st.eng = sc.nextInt();
			} else {
				System.out.println("수학점수를 기입해주세요.");
				st.mat = sc.nextInt();
			}
		}

		st.StudentInit(st.name, st.ban, st.no);

		st.getTotal(st.kor, st.eng, st.mat);

		st.getAvg(st.kor, st.eng, st.mat);

		sc.close();
	}

}
