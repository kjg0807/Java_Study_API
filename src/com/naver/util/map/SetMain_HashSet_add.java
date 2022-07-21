package com.naver.util.map;

import java.util.HashSet;

public class SetMain_HashSet_add
{
	public static void main(String[] args)
	{
		HashSet<Integer> hash = new HashSet<>();

		hash.add(10);
		hash.add(1);
		hash.add(10);
		
		System.out.println(hash.size());
	}
}
