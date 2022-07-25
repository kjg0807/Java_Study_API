package com.naver.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2
{
	Scanner sc = new Scanner(System.in);
	// getFood - 서버 접속 후
	// 1. 점심메뉴 2. 저녁메뉴 3. 종료
	// 번호를 입력받아서 server로 전송 - 받아서 출력

	public void getFood() throws Exception
	{
		Socket socket = new Socket("192.168.7.9", 8282);

		OutputStream os = null; // 0과 1로 처리
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		boolean ch = true;
		while (ch)
		{
			System.out.println("1. 점심메뉴, 2. 저녁메뉴, 3. 프로그램 종료");
			int sel = sc.nextInt();

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			bw.write(sel + "\r\n");
			bw.flush();

			if (sel == 3)
			{
				break;
			}
			// 1번 -> 메뉴1개
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			String message = br.readLine();
			System.out.println(message);
		}
		os.close();
		ow.close();
		bw.close();
		is.close();
		ir.close();
		br.close();
		socket.close();
	}
}
