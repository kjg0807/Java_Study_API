package com.naver.io.file;

import java.io.File;

public class FileMain2
{

	public static void main(String[] args)
	{
		File file = new File("C:\\study");

		String[] name = file.list();
		for (String s : name)
		{
			System.out.println(s);
		}
		File[] files = file.listFiles();
		for (File f : files)
		{
			if (f.isFile())
			{
				if (f.length() == 0)
				{
					f.delete();
				}
			}
		}
	}

}
