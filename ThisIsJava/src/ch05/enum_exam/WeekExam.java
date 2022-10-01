package ch05.enum_exam;

import java.util.Calendar;

public class WeekExam {
	public static void main(String[] args) {
		Week today = null; // 열거타입을 호출 한 뒤 초기화.

		// 달력 얻기, calendar class에서 따온다. import과정도 거쳐야함, 캘린더 스펠링 calendar임 der아님 ㅡㅡ
		Calendar cal = Calendar.getInstance();

		// 오늘의 요일 얻어내기(1~7)
		int week = cal.get(Calendar.DAY_OF_WEEK);

		// 인트타입으로 week변수 선언을 하고 캘린더 클래스의 한 주와 관련된 클래스를 호출하였으니
		// 이제 인트타입의 숫자를 요일로 바꿔주어야한다. switch문 사용

		switch (week) {
		case 1:
			today = Week.MONDAY;
			break;
		case 2:
			today = Week.THUESDAY;
			break;
		case 3:
			today = Week.WEDNESDAY;
			break;
		case 4:
			today = Week.THUESDAY;
			break;
		case 5:
			today = Week.FRIDAY;
			break;
		case 6:
			today = Week.SATURDAY;
			break;
		case 7:
			today = Week.SUNDAY;
			break;

		// 입력되는 정수의 값에 따라 월~일 출력. 요일의 시작을 MONDAY로 해주었다.
		// 일요일로 하고싶다면 case 1에 sunday 호출.

		} 
		//열거타입 변수를 사용해보자
		if (today==Week.SUNDAY) {
			System.out.println("주말에는 공부 아니면 죽는다는 생각으로 공부를 합니다.");
		} else {
			System.out.println("평일에는 학원끝나고 천천히 공부를 합니다.");
		}
	}

}
