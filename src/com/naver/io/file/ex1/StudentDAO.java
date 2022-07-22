package com.naver.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO // DAO - Data Access Object =
{
	// file data에 접근
	// 1. getList - studentData파일의 내용을 읽어서 작업
	public ArrayList<StudentDTO> getList() throws Exception
	{
		ArrayList<StudentDTO> ar = new ArrayList<>();
		File file = new File("D:\\study\\studentData.txt");

		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		// 첫줄 공백 제거
		br.readLine();
		while (check)
		{ // While 시작
			String data = br.readLine();
			if (data == null)
			{
				break;
			}

			// ---Array 2---
			String[] info = data.split(",");
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(info[0]);
			studentDTO.setNum(Integer.parseInt(info[1].trim()));
			studentDTO.setKor(Integer.parseInt(info[2].trim()));
			studentDTO.setEng(Integer.parseInt(info[3].trim()));
			studentDTO.setMath(Integer.parseInt(info[4].trim()));
			ar.add(studentDTO);

		} // while 끝

		return ar;
	}

	// 2. setList ->
	public ArrayList<StudentDTO> setList(ArrayList<StudentDTO> ar) throws Exception
	{
		// 예외 처리는 내부에서 처리
		// list로 받은 데이터를 studentData에 작성
		// 기존 내용 삭제 - 작성 형식은 기존 내용 형식과 동일하게
		// 1을 리턴: 정상적인 성공, 0을 리턴 : 예외가 발생했을 경우
		ArrayList<StudentDTO> ar1 = new ArrayList<>();		

		File file = new File("D:\\study", "studentData.txt");

		FileWriter fw = new FileWriter(file);

		fw.write("kim, 5, 78, 85, 76\r\n"); // \r: 버퍼를 flush할때 뒤로 뺀다, \n: enter키 -> 필수
		//iu, 1, 56, 54, 85
		fw.flush();		

		return ar1;
	}
}
