package com.naver.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite
{
	public void write() throws Exception
	{
		File file = new File("D:\\study", "test.txt");

		FileWriter fw = new FileWriter(file, false);

		fw.write("Today String\r\n"); // \r: 버퍼를 flush할때 뒤로 뺀다, \n: enter키 -> 필수
		//fw.flush(); // 내용을 버퍼로 밀어버림 - 내용 삭제
		
		fw.write("tomorrow\r\n");
		fw.flush();
	}
}
