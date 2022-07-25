package com.naver.thread;

public class ThreadTest1 extends Thread
{
	@Override
	public void run()
	{
		try
		{
			this.getNum();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void getNum() throws Exception
	{
		int i = 0;
		for (i = 1; i < 25; i++)
		{
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}
