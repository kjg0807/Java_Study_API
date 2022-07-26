package com.naver.io.file.ex1;

import java.util.ArrayList;

public class ExMain
{

	public static void main(String[] args)
	{
		// StudentDAO sd = new StudentDAO();
		StudentService studentService = new StudentService();
		ArrayList<StudentDTO> ar = null;

		try
		{
			ar = studentService.getList();
			for (StudentDTO stu : ar)
			{
				System.out.println(stu.getName());
				System.out.println(stu.getNum());
				System.out.println(stu.getKor());
				System.out.println(stu.getEng());
				System.out.println(stu.getMath());
				System.out.println("---------------");
			}
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("Add");
		studentDTO.setNum(6);
		studentDTO.setKor(50);
		studentDTO.setEng(50);
		studentDTO.setMath(50);
		ar.add(studentDTO);

		try
		{
			int result = studentService.setList(ar);
			System.out.println("Result : " + result);
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
