package com.naver.lang;

public class Langname
{
	public static void main(String[] args)
	{
		Object obj = new Object();
		String str = obj.toString();
		Member member = new Member();
		
		System.out.println(str);
		str = member.toString();
		System.out.println(str);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		obj = member; //모든 클래스는 모두 오브젝트타입이다.
		//클래스의 제일 위는 object
		
		//obj, car, memberClient을 하나의 타입에 담기
		boolean ch = car.equals(car2); //car와 car2의 매개변수 주소가 같은지 -> car == car2
		System.out.println(ch);
		System.out.println(car);
		System.out.println(car.toString()); //그냥 car랑 car.toString 이랑 같음
		
		String name = "iu";
		System.out.println(name);
	}
}
