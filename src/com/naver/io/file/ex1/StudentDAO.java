package com.naver.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	public int setList(ArrayList<StudentDTO> ar)
	{
		// 예외 처리는 내부에서 처리
		// list로 받은 데이터를 studentData에 작성
		// 기존 내용 삭제 - 작성 형식은 기존 내용 형식과 동일하게
		// 1을 리턴: 정상적인 성공, 0을 리턴 : 예외가 발생했을 경우
		int rs = 1;
		ArrayList<StudentDTO> ar1 = new ArrayList<>();

		File file = new File("D:\\study", "studentData.txt");
		FileWriter fw = null;

		try
		{
			fw = new FileWriter(file);
			fw.write("\r\n"); // 첫번째줄 빈줄
			for (StudentDTO studentDTO : ar)
			{
				StringBuffer stringBuffer = new StringBuffer(); // 문자열을 합침
				stringBuffer.append(studentDTO.getName() + ",");
				stringBuffer.append(studentDTO.getNum() + ",");
				stringBuffer.append(studentDTO.getKor() + ",");
				stringBuffer.append(studentDTO.getMath() + ",");
				stringBuffer.append(studentDTO.getEng() + "\r\n");
				fw.write(stringBuffer.toString());
			}
			fw.flush();
		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			rs = 0;
		}

		return rs;
	}
}
