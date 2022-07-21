package com.naver.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4_getTime_add
{

	public static void main(String[] args)
	{
		Calendar ca = Calendar.getInstance();

		System.out.println(ca.getTime());

		// ca.roll(Calendar.MINUTE, 15);
		ca.add(Calendar.MINUTE, 15);
		System.out.println(ca.getTime());
		System.out.println("---------------------");
		
		ca = Calendar.getInstance();		
		String patt = "yyyy년 MM월 dd일 E";
		
		SimpleDateFormat sd = new SimpleDateFormat(patt);
		String time = sd.format(ca.getTime()); //Date 객체로 변환
		
		System.out.println(time);
	}

}
