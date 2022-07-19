package com.naver.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2
{
	// juminCheck - 주민번호 입력
	// - 9 7 1 1 2 4 - 1 2 3 4 5 6 7(체크용번호) 예시
	// **2 3 4 5 6 7 8 9 2 3 4 5 =자릿수마다 곱하기
	// 18 21 4 5 12 28 - 8 18 6 12 20 30 =전체 다 더하기
	// 총합: 182 -> 11로 나누어서 나머지를 구한다 -> 16.545454... - 16 나머지: 5
	// 11 - 나머지(5) = 6 -> 이 결과를 체크용 번호와 같은지 비교
	// 만약에 위의 연산결과가 두자리라면 연산결과를 다시 10으로 나눈 나머지와 체크용번호를 비교
	Scanner sc = new Scanner(System.in);

	public void juminCheck()
	{
		
	}
}
