package com.naver.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain2_ReaderTryCatch_close
{

	public static void main(String[] args)
	{
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);

		System.out.println("입력");

		String message = "";
		try
		{
			message = br.readLine();
			System.out.println(message);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			// 연결된 역순으로 자원 해제
			try
			{
				br.close();
				ir.close();
				is.close();
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}
