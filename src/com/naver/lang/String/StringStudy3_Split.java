package com.naver.lang.String;

public class StringStudy3_Split
{
	public void studySplit()
	{
		String str = "iu,suji,choa,hani";

		String[] names = str.split(",");

		// 향상된 for문 - for(배열에 모은 데이터타입 변수명: 배열 참조 변수명 ) {}
		for (String name : names) // 참조 변수명(names)에서 데이터타입 변수name에 내용을 전부 꺼낼때까지 반복
		{
			System.out.println(name);
		}
	}

	public void studySplit2()
	{
		String info = "1997 12 24";

		String[] p = info.split(" ");

		for (String pi : p)
		{
			System.out.println(pi);
		}
	}

	public void studySplit3()
	{
		String info = "서울,대전-대구,부산-제주,광주-강릉";

		info = info.replace("-", ",");
		String[] place = info.split(",");

		for (String place1 : place)
		{
			System.out.println(place1);
		}
	}
}
