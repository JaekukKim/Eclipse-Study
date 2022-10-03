package ch12.sec15.format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {
	public static void main(String[] args) {
		// 날짜를 관리하는 Date 객체 생성.
		Date date = new Date();

		// SimpleDateFormat으로 날짜를 특정한 패턴으로 바꾸기.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		// 결과값 : 2022-10-03 (현 os에 저장되어있는 시간값 출력)

		// 다른패턴
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));

		// 다른패턴 (시분초 : HH mm ss)
		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		// yyyy = 년도 / MM = 월 / DD = 일 / a = 오전오후인지 / HH = 시간 / mm = 분 / ss = 초
		System.out.println(sdf.format(date));
		// 결과값 : 2022.10.03 오전 10:51:15

		// 다른패턴 (요일출력 : 대문자E를 사용)
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일, 오늘은 E요일 입니다.");
		System.out.println(sdf.format(date));
		// 결과값 : 2022년 10월 03일, 오늘은 월요일 입니다.

		// 다른패턴 (올해처음으로부터 몇일이 흘렀는지 : 대문자D사용)
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일은 올해의 D번째 날 입니다.");
		System.out.println(sdf.format(date));
		// 결과값 : 2022년 10월 03일은 올해의 276번째 날 입니다. (벌써..?)
		
		// 다른패턴 (이번 달로부터 몇일이 흘렀는지 : 소문자d사용)
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일은 이번 달의 d번째 날 입니다.");
		System.out.println(sdf.format(date));
		// 결과값 : 2022년 10월 03일은 이번 달의 3번째 날 입니다. (비 겁나옴)
	}

}
