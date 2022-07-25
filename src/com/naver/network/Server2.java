package com.naver.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2
{
	Scanner sc = new Scanner(System.in);
	// getFood - Server에서 메세지를 기다림
	// 1. 점심메뉴중 랜덤한 하나를 골라서 Client로 전송
	// 2. 저녁메뉴중 랜덤한 하나를 골라서 Client로 전송
	// 3. 프로그램 종료
	// 그외 나머지 : 잘못 입력된 번호를 Client로 전송

	private ArrayList<String> lunch;
	private ArrayList<String> dinner;

	public Server2()
	{
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();

		lunch.add("오늘 점심: 짜장면");
		lunch.add("오늘 점심: 라면");
		lunch.add("오늘 점심: 햄버거");
		lunch.add("오늘 점심: 피자");
		lunch.add("오늘은 다이어트: 안먹어");

		dinner.add("오늘 저녁: 삼겹살");
		dinner.add("오늘 저녁: 치킨");
		dinner.add("오늘 저녁: 샐러드");
		dinner.add("오늘 저녁: 볶음밥");
		dinner.add("오늘 저녁: 물");
	}

	public void getFood() throws Exception
	{
		ServerSocket serverSocket = new ServerSocket(8282);
		Socket socket = serverSocket.accept();

		boolean ch = true;

		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;

		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		while (ch)
		{
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			String message = br.readLine(); // 무조건 String 으로 받기
			// int sel = Integer.parseInt(message); //int형으로 바꾸고 해도 됨
			Random random = new Random(Calendar.getInstance().getTimeInMillis());

			if (message.equals("1"))
			{
				int index = random.nextInt(lunch.size());
				message = lunch.get(index);
			}
			else if (message.equals("2"))
			{
				int index = random.nextInt(dinner.size());
				message = dinner.get(index);
			}
			else if (message.equals("3"))
			{
				break;
			}
			else
			{
				message = "잘 못된 입력된 번호";
			}
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);// 문자
			bw = new BufferedWriter(ow);

			bw.write(message + "\r\n");
			bw.flush();
		}
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		serverSocket.close();
	}
}
