package com.naver.thread;

public class ThreadMain
{
	public static void main(String[] args)
	{
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		Thread t = new Thread(t2);

		// 개발자가 직접 호출이 아니라 OS에게 실행 부탁
		t1.start();
		t.start();

		// try
		// {
		// t1.getNum();
		// t2.getAlpa();
		// }
		// catch (Exception e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
	}
}
