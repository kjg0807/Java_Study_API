package com.naver.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2_Date
{

	public static void main(String[] args)
	{
		Calendar now = Calendar.getInstance();

		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 2000);
		birth.set(Calendar.MONTH, 11); // 쓴거보다 1커짐
		birth.set(Calendar.DATE, 24);

		// future.set(Calendar.MINUTE, 15);
		//
		// long n = now.getTimeInMillis();
		// long f = future.getTimeInMillis();
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long rs = n - b;

//		System.out.println(rs);
//		System.out.println(rs / 1000); // 초
//		System.out.println(rs / (1000 * 60)); // 분
//		System.out.println(rs / ((1000 * 60) * 60)); // 시
//		rs = rs / ((1000 * 60) * 60 * 24);
//		System.out.println(rs / 365); // 1일

		Date date = now.getTime();
		System.out.println(date);
	}
}
