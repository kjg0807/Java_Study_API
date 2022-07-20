package com.naver.util.st;

import java.util.StringTokenizer;

public class StMain1
{

	public static void main(String[] args)
	{
		String str = "sumsung-500-LG-600-google-900";
		
		StringTokenizer st = new StringTokenizer(str, "-");
		// str 변수에서 - 로 구별

		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) // 다음 토큰이 존재할 때
		{
			// parsing
			String token = st.nextToken(); // 위에서 선언한 - 을 기준으로 다음문자로 계속 넘어감
			System.out.println(token); // 토큰 갯수
			token = st.nextToken(); // 다음 토큰 내용을 token에 대입
			System.out.println(token);
			System.out.println("==========");
		}
	}

}
