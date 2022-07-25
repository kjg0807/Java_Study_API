package com.naver.io.file.ex1;

import java.io.File;
import java.util.ArrayList;

import com.naver.io.file.FileRead;

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
	}
}
