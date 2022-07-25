package com.naver.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service
{
	private StudentDAO studentDAO;

	public StudentService()
	{
		this.studentDAO = new StudentDAO();
	}

	@Override
	public ArrayList<StudentDTO> getList() throws Exception
	{
		// TODO Auto-generated method stub
		ArrayList<StudentDTO> ar = studentDAO.getList();
		for (StudentDTO studentDTO : ar)
		{
			studentDTO.setTotal(studentDTO.getKor() + studentDTO.getMath() + studentDTO.getEng());
			studentDTO.setAvg(studentDTO.getTotal() / 3.0);
		}
		return ar;
	}

	@Override
	public int setList(ArrayList<StudentDTO> ar)
	{
		int rs = 0;
		// TODO Auto-generated method stub
		return rs;
	}

	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar)
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
