package com.naver.io.file.ex1;

import java.util.ArrayList;

public interface Service
{
	// Service 안에 StudentDTO 객체 만들어야 됨

	// StudentDAO의 getList 호출, 총점과 평균을 계산해서 대입하고, 그 리스트를 리턴
	public static ArrayList<StudentDTO> getList() throws Exception
	{

		return null;
	}

	// StudentDAO의 setList 호출, 결과를 리턴
	public static int setList(ArrayList<StudentDTO> ar) throws Exception
	{

		return 0;
	}

	// 뒤에서 한 Student 보고 참고
	// 찾으려고 하는 학생의 번호를 입력받아 찾은 학생을 리턴
	public static StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception
	{

		return null;
	}

	// 삭제하려는 학생의 번호를 입력받아 일치하는 학생을 삭제
	// 삭제 성공시 1리턴, 실패시 0리턴
	public static int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception
	{

		return 0;
	}
}
