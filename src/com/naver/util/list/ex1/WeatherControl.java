package com.naver.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherControl
{
	// WeatherController - start
	// 1. 날씨 정보 초기화 - init?
	// 2. 전국 날씨 출력 -
	// 3. 지역 날씨 검색 - 도시명 검색 후 날씨 출력
	// 4. 지역 정보 추가
	// 5. 지역 정보 삭제
	// 6. 프로그램 종료
	Scanner sc = new Scanner(System.in);

	public void start()
	{
		System.out.println("---날씨 정보---");
		boolean ch = true;

		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();

		CityDTO city = new CityDTO();

		ArrayList<CityDTO> ar = new ArrayList<>();
		ar.add(city);

		while (ch)
		{
			System.out.println("1. 날씨 정보 초기화, 2. 전국 날씨 출력, 3. 지역 날씨 검색, 4. 지역 정보 추가, 5. 지역 정보 삭제, 6. 프로그램 종료");
			int input = sc.nextInt();

			if (input == 1)
			{
				// System.out.println("날씨 정보 초기화");
				ws.deleteWeather(ar);
			}
			else if (input == 2)
			{
				// System.out.println("전국 날씨 출력");
				wv.view(ar);
			}
			else if (input == 3)
			{
				// System.out.println("지역 날씨 검색");
				ws.findWeather(ar);
			}
			else if (input == 4)
			{
				// System.out.println("지역 정보 추가");
				ws.addWeather(ar);

			}
			else if (input == 5)
			{
				// System.out.println("지역 정보 삭제");
				ws.removeWeather(ar);
			}
			else if (input == 6)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
