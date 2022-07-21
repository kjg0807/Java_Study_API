package com.naver.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain_HashMap
{

	public static void main(String[] args)
	{
		HashMap<String, Integer> map = new HashMap<>();

		map.put("n1", 5);
		map.put("n2", 20);

		System.out.println(map.size());
		System.out.println(map.isEmpty()); // isEmpty - 내용이 비어있는지 -> true, false

		int num = map.get("n1");
		System.out.println(num);

		boolean ch = map.containsKey("n2");
		System.out.println(ch);

		Set<String> set = map.keySet();

		Iterator<String> it = set.iterator();

		while (it.hasNext())
		{
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}
}
