package com.naver.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService //
{
	// init 메서드 - sb에 있는 Data를 파싱해서 CityDTO에 담아서 리턴
	// add 메서드 - city정보를 입력받아 추가
	// remove 메서드 - 도시명을 입력받아서 리스트에서 삭제
	// find 메서드 - 도시명을 입력받아서 리스트에서 검색리턴

	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);

	public WeatherService()
	{
		sb = new StringBuffer();
		sb.append("Seoul, 30.2, 70, 맑음-");
		sb.append("Daegue, 38.9, 90, 흐림-");
		sb.append("Jeju, 13.0, 73, 맑음-");
		sb.append("Busan, 0.5, 85, 태풍-");
	}

	public void init(ArrayList<CityDTO> ar)
	{
		String data = sb.toString();
		data = data.replace("-", ",");
		data = data.replace(" ", "");

		StringTokenizer st = new StringTokenizer(data, ",");

		while (st.hasMoreTokens())
		{
			CityDTO city = new CityDTO();
			city.setName(st.nextToken());
			city.setGion(st.nextToken());
			city.setHum(st.nextToken());
			city.setStatus(st.nextToken());

			ar.add(city);
		}
	}

	public boolean addWeather(ArrayList<CityDTO> ar)
	{
		// System.out.println("정보 추가");
		CityDTO city = new CityDTO();

		System.out.println("도시명 입력");
		city.setName(sc.next());
		System.out.println("기온 입력");
		city.setGion(sc.next());
		System.out.println("습도 입력");
		city.setHum(sc.next());
		System.out.println("날씨 입력");
		city.setStatus(sc.next());

		return ar.add(city);
	}

	public boolean removeWeather(ArrayList<CityDTO> ar)
	{
		// System.out.println("삭제할 날씨 입력");
		System.out.println("삭제할 도시명 입력");
		String name = sc.next();
		boolean r = false;
		// for (int i = 0; i < ar.size(); i++)
		// {
		// if (name.equals(ar.get(i).getName()))
		// {
		// ar.remove(i);
		// break;
		// }
		// }
		for (CityDTO city : ar)
		{
			if (name.equals(city.getName()))
			{
				ar.remove(city);
				r = !r;
				break;
			}
		}
		return r;
	}

	public CityDTO findWeather(ArrayList<CityDTO> ar)
	{
		// System.out.println("날씨 검색할 지역 입력");
		CityDTO city = null;
		System.out.println("검색할 도시명 입력");
		String name = sc.next();

		for (CityDTO city1 : ar)
		{
			if (name.equals(city1.getName()))
			{
				city = city1;
				break;
			}
		}

		return city;
	}
}
