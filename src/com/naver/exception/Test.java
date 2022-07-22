package com.naver.exception;

import java.util.Random;
import java.util.Scanner;

public class Test
{
	Scanner sc = new Scanner(System.in);

	public void t4() throws Exception
	{
		// 유치원생 프로그램 - 0 ~ 99
		int num = 48;
		int num2 = 82;
		int num3 = num + num2;
		int num4 = num - num2;

		if (num3 > 99)
		{
			throw new MyException("???");
		}
		if (num4 < 0)
		{
			throw new MyException("그런 숫자 몰라요");
		}
	}

	public void t3() throws Exception
	{
		String str = null;
		System.out.println(str.toString());
	}

	public void t2()
	{
		String[] str = { "10", "five", "3.14" };

		for (String s : str)
		{
			try
			{
				System.out.println("숫자 입력");
				int n = sc.nextInt();

				int num = Integer.parseInt(s);
				num = n / num;
				System.out.println(num);
			}
			catch (NumberFormatException e)
			{
				System.out.println("예외 처리");
			}
			catch (ArithmeticException e)
			{
				System.out.println("수학 오류 해결");
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			catch (Throwable e)
			{
				System.out.println(e);
			}
		}
	}

	public void t1()
	{
		System.out.println("t1 메서드 실행");

		Random random = new Random();

		String str = null;

		if (random.nextInt(10) % 2 == 0)
		{
			str = "10";

		}
		int num = Integer.parseInt("10");
		num = num / random.nextInt(2);
		System.out.println(num);

		new NullPointerException();
		System.out.println("t1 메서드 종료");
	}
}
