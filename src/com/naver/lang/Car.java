package com.naver.lang;

public class Car
{
	public boolean equals(Object obj)
	{
		Car car = (Car) obj;
		return true;
	}

	public String toString()
	{
		return "car에서 Overriding 함";
	}
}
