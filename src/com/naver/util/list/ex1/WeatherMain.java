package com.naver.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain
{

	public static void main(String[] args)
	{
		// 1. 클래스 역할과 메서드 역할 변수의 역할 파악
		// WeatherMain - 프로그램 실행, Test
		// WeatherController - 관리
		// WeatherService - data 가공
		// WeatherView - 정보 출력 (작업X) 읽기 전용
		// CityDTO - Data(다른 작업X)

		WeatherControl wc = new WeatherControl();
		wc.start();
	}
}
