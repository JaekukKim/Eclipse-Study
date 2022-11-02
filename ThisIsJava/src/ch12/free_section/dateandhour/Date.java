package ch12.free_section.dateandhour;
import java.util.Calendar;


public class Date {
	public static void main(String[] args)  { //주석 색 빨간색으로 바꿈 가독성 굳
	Calendar now = Calendar.getInstance();
	
	int year = now.get(Calendar.YEAR); // . 호출연산자
	int month = now.get(Calendar.MONTH) + 1 ;
	int day = now.get(Calendar.DAY_OF_MONTH);
	int week = now.get(Calendar.DAY_OF_WEEK);
	
	String wek = null;
	
	switch (week) {
	case Calendar.MONDAY: wek = "월"; break;
	case Calendar.TUESDAY: wek = "화"; break;
	case Calendar.WEDNESDAY: wek = "수"; break;
	case Calendar.THURSDAY: wek = "목"; break;
	case Calendar.FRIDAY: wek = "금"; break;
	case Calendar.SATURDAY: wek = "토"; break;
	case Calendar.SUNDAY: wek = "일"; break;
	
		
		}
	int amPm = now.get(Calendar.AM_PM);
	String ampm = null;
	if (amPm==Calendar.AM) {
		ampm = "오전";
		
	} else {
		ampm = "오후";
	}
	int hour = now.get(Calendar.HOUR);
	int minute = now.get(Calendar.MINUTE);
	int second = now.get(Calendar.SECOND);
	
	System.out.print(year + "년 ");
	System.out.print(month + "월 ");
	System.out.print(day + "일 ");
	System.out.print(wek + "요일 ");
	System.out.print(ampm);
	System.out.print(hour + "시 ");
	System.out.print(minute + "분 ");
	System.out.print(second + "초 ");
	System.out.print("입니다.");
	
	}

}
