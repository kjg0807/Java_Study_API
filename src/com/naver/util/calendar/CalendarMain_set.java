package com.naver.util.calendar;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain_set
{

	public static void main(String[] args)
	{
		// Calendar ca = new GregorianCalendar();
		Calendar ca = Calendar.getInstance(); // 위와 동일
		// 현재 년 월 일 시 분 초 milliSecond -
		System.out.println(ca);
		ca.set(Calendar.YEAR, 2002);
		ca.set(Calendar.MONTH, 11);
		ca.set(Calendar.DATE, 25);

		int y = ca.get(Calendar.YEAR);
		int m = ca.get(Calendar.MONTH);
		int d = ca.get(Calendar.DATE);		
		int h = ca.get(Calendar.HOUR_OF_DAY);
		int mi = ca.get(Calendar.MINUTE);
		int s = ca.get(Calendar.SECOND);
		System.out.println(y);
		System.out.println(m+1);
		System.out.println(d);		
		System.out.println(h);
		System.out.println(mi);
		System.out.println(s);
	}

}
