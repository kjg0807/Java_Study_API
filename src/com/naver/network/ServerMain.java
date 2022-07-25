package com.naver.network;

public class ServerMain
{
	public static void main(String[] args)
	{
		System.out.println("Server Start");

		// Server1 s = new Server1();
		// try
		// {
		// s.receive();
		// }
		// catch (Exception e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		Server2 s = new Server2();
		try
		{
			s.getFood();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Server Finish");
	}
}
