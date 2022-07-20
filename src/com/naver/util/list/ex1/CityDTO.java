package com.naver.util.list.ex1;

public class CityDTO // 도시의 날씨정보
{
	private String name; // 도시명
	private String gion; // 기온정보 - 온도
	private String hum; // 습도
	private String status; // 맑음, 비, 눈, 태풍...

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getGion()
	{
		return gion;
	}

	public void setGion(String gion)
	{
		this.gion = gion;
	}

	public String getHum()
	{
		return hum;
	}

	public void setHum(String hum)
	{
		this.hum = hum;
	}

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}
}
