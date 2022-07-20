package com.naver.util.list.ex1;

import java.util.ArrayList;

public class WeatherView
{
	// WetherView - view 리스트를 받아서 모든 정보 출력
	// -view - city 하나를 받아서 모든 정보를 출력
	// -view - 메세지(String) 하나를 받아서 출력

	public void view(String message)
	{
		// System.out.println("입력한 전체 날씨 출력");
		System.out.println(message);
	}

	public void view(CityDTO city)
	{
		System.out.println(city.getName());
		System.out.println(city.getGion());
		System.out.println(city.getHum());
		System.out.println(city.getStatus());
	}

	public void view(ArrayList<CityDTO> ar)
	{
		int i;
		for (i = 0; i < ar.size(); i++)
		{
			CityDTO citydto = ar.get(i);

			this.view(citydto);
		}
	}
}
