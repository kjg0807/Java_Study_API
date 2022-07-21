package com.naver.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class SetMain2_ExRandomNum
{

	public static void main(String[] args)
	{
		// Random - 1 ~ 45 중 숫자 6개 set으로 중복되지 않는 숫자 입력
		Random r = new Random();
		HashSet<Integer> hash = new HashSet<>();		
		boolean ch = true;
		
		while (ch)
		{
			int a = r.nextInt(45) + 1;
			hash.add(a);

			if (hash.size() == 6)
			{
				break;
			}
		}
		System.out.println(hash);
	}

}
