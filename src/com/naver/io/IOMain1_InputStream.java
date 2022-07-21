package com.naver.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1_InputStream
{

	public static void main(String[] args)
	{
		// 키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in; // byte 처리
		InputStreamReader ir = new InputStreamReader(is); // 한 글자
		BufferedReader br = new BufferedReader(ir); // 키보드와 연결
		try
		{
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
