package com.naver.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1
{
	Scanner sc = new Scanner(System.in);

	public void send() throws Exception
	{
		Socket socket = new Socket("192.168.7.9", 8282);
		System.out.println("Server 접속 완료");
		// 전송 준비
		OutputStream os = null; // 0과 1로 처리
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		boolean ch = true;
		loop: while (ch)
		{
			System.out.println("서버로 보낼 메세지 입력");
			String message = sc.next();

			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);

			// 실제 전송
			bw.write(message + "\r\n");
			bw.flush();

			if (message.equals("q") || message.equals("Q"))
			{
				System.out.println("프로그램 종료");
				break loop;
			}

			// ---------------------------------------------
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			message = br.readLine();

			if (message.toLowerCase().equals("q"))
			{
				break;
			}

			System.out.println("Server : " + message);
		}
		// 자원 해제
		bw.close();
		ow.close();
		os.close();
		socket.close();
	}
}
