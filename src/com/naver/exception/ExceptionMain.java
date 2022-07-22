package com.naver.exception;

public class ExceptionMain
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("main 시작");

		Test test = new Test();

		//test.t1();
		//test.t2();
//		try
//		{
//			test.t3();
//		}
//		catch (Exception e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		test.t4();

		System.out.println("main 종료");
	}
}
