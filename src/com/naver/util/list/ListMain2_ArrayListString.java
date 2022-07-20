package com.naver.util.list;

import java.util.ArrayList;

public class ListMain2_ArrayListString
{
	public static void main(String[] args)
	{
		ListView lv = new ListView();
		ArrayList<String> ar = new ArrayList<>();		

		ar.add("frist");
//		ar.add(2); // Integer auto boxing
//		ar.add('c'); // Character auto boxing -> 다양성
//		ar.add(2.123); // doublc auto boxing
		ar.add(null);

		lv.view(ar);

		// get - 특정한 인덱스에 요소를 반환
		String s = ar.get(0);
//		int a = (int) ar.get(1);
//		char c = (char) ar.get(2);
//		double d = (double) ar.get(3);
		
		System.out.println(ar.get(0) instanceof String); // ar.get(0)이 String 타입인지

		System.out.println(s);
//		System.out.println(a);
//		System.out.println(c);
//		System.out.println(d);
	}
}
