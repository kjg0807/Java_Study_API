package com.naver.network;

public class ClientMain
{
	public static void main(String[] args)
	{
		System.out.println("Client Start");

		// Client1 c = new Client1();
		// try
		// {
		// c.send();
		// }
		// catch (Exception e)
		// {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		
		Client2 c = new Client2();
		try
		{
			c.getFood();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Client Finish");
	}
}
