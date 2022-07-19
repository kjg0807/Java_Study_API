package com.naver.lang.String;

public class StringBufferStudy
{

	public static void main(String[] args)
	{
		String str1 = "max";
		String str2 = "age";

		// str1 = str1 + str2;

		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);

		String rs = sb.toString();
		System.out.println(sb);
		System.out.println(rs);
	}
}
