package com.naver.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead
{
	public void read() throws Exception
	{
		// 파일의 내용 읽어오기
		// 1. 어느 폴더의 어느 파일
		File file = new File("D:\\study", "test.txt");
		// 2. 파일 연결
		FileReader fr = new FileReader(file);
		// 3. 파일의 내용 열기
		// fr.read(); - 한 글자씩 읽음
		BufferedReader br = new BufferedReader(fr);
		String name = "";

		// 4. 내용 읽기
		boolean ch = true;
		while (ch)
		{
			name = br.readLine(); // 엔터키를 만날때까지 읽어옴
			if (name == null)
			{
				break;
			}
			else
			{
				System.out.println(name);
			}
		}
	}
}
