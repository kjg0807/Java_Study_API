package com.naver.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1
{
	// ex1 주민번호 입력: 6-7 : 971224 - 1234567
	// 1. 남자 여자 판단
	Scanner sc = new Scanner(System.in);

	public void peopleNumber()
	{
		System.out.println("주민번호 앞자리 입력");
		String peoNumF = sc.next();
		System.out.println("주민번호 뒷자리 입력");
		String peoNumB = sc.next();

		char firstNum = peoNumB.charAt(0);

		if (firstNum == '1' || firstNum == '3')
		{
			System.out.println("남자");
		}
		else if (firstNum == '2' || firstNum == '4')
		{
			System.out.println("여자");
		}
		// 2. 현재 나이 출력 -> 현재연도뒷자리2개 - 주민번호 앞자리 2개

		int strint = Integer.parseInt(peoNumF.substring(0, 2)); // 주민번호 앞자리 2개
		int year = 22;
		int rs = year - strint; // 2000연도 이전(1900)년대는 +100

		if (firstNum == '1' || firstNum == '2')
		{
			rs = rs + 100;
		}
		System.out.println("현재 나이: " + rs);
		// 3. 3 ~ 5월 봄, 6 ~ 8월 : 여름, 9~ 11월 가을 12 ~ 2월 겨울

		int birth = Integer.parseInt(peoNumF.substring(2, 4));

		if (birth > 2 && birth < 6)
		{
			System.out.println("생일: " + birth + "월" + " 봄");
		}
		else if (birth > 5 && birth < 9)
		{
			System.out.println("생일: " + birth + "월" + " 여름");
		}
		else if (birth > 8 && birth < 12)
		{
			System.out.println("생일: " + birth + "월" + " 가을");
		}
		else if (birth == 12)
		{
			System.out.println("생일: " + birth + "월" + " 겨울");
		}
		else if (birth > 0 && birth < 3)
		{
			System.out.println("생일: " + birth + "월" + " 겨울");
		}
	}
}
