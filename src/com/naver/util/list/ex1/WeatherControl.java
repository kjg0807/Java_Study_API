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
	// 결합도가 강하다(높다): 자체에서 객체 생성
	// 결합도가 느슨하다(낮다): 매개변수를 통해서 만들어진 객체를 주입
	// ----------------------> 생성자의 매개변수

	private WeatherService ws;
	private WeatherView wv;
	private Scanner sc;

	public WeatherControl()
	{
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		this.sc = new Scanner(System.in);
	}

	public void start()
	{
		System.out.println("---날씨 정보---");
		boolean ch = true;

		ArrayList<CityDTO> ar = new ArrayList<>();

		while (ch)
		{
			System.out.println("1. 날씨 정보 초기화, 2. 전국 날씨 출력, 3. 지역 날씨 검색, 4. 지역 정보 추가, 5. 지역 정보 삭제, 6. 프로그램 종료");
			int input = sc.nextInt();

			if (input == 1)
			{
				// System.out.println("날씨 정보 초기화");
				ws.init(ar);
			}
			else if (input == 2)
			{
				// System.out.println("전국 날씨 출력");
				wv.view(ar);
			}
			else if (input == 3)
			{
				// System.out.println("지역 날씨 검색");
				CityDTO city1 = ws.findWeather(ar);
				if (city1 != null)
				{
					wv.view(city1);
				}
				else
				{
					wv.view("잘못 된 도시명");
				}
			}
			else if (input == 4)
			{
				// System.out.println("지역 정보 추가");
				boolean rs = ws.addWeather(ar);
				String message = "추가 실패";
				if (rs)
				{
					message = "추가 성공";
				}
				wv.view(message);
			}
			else if (input == 5)
			{
				// System.out.println("지역 정보 삭제");
				boolean rs = ws.removeWeather(ar);
				String message = "삭제 실패";
				if (rs)
				{
					message = "삭제 성공";
				}
				wv.view(message);
			}
			else
			{
				System.out.println("프로그램 종료");
				ch = !ch;
				break;
			}
		}
	}
}
