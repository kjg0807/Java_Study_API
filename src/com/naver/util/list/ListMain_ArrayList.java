package com.naver.util.list;

import java.util.ArrayList;

public class ListMain_ArrayList
{
	public static void main(String[] args)
	{
		// 1, 2, 3
		// int[] num = new int[3];
		// num[0] = 1;
		//
		// // 1. list -> ArrayList
		ArrayList ar = new ArrayList();

		// add - 배열에 요소 추가
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		ar.add(0);
		ar.add(1, "abc"); // index 1번에 abc를 대입

		ListView lv = new ListView();
		lv.view(ar);
		// remove - 특정 인덱스 번호의 요소를 삭제
		ar.remove("abc");
		lv.view(ar);

		// set - 특정 인덱스 번호의 요소를 수정
		ar.set(1, 'c');
		lv.view(ar);

		// clear - 모든 요소 삭제
		ar.clear();
		lv.view(ar);
	}
}
