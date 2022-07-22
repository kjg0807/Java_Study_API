package com.naver.io.file;

import java.io.File;

public class FileMain
{

	public static void main(String[] args)
	{
		// File : 파일이나 폴더의 정보를 담는 클래스, 실제 파일이나 폴더가 없을 수도 있음
		File file = new File("C:\\study\\test.txt"); // 폴더명 + 파일명
		file = new File("C:\\study", "test.txt"); // parent: 폴더, chile: 파일명 또는 최종 폴더명

		// 1. 폴더명 경로가 있는 File객체 사용
		File path = new File("C:\\study");

//		System.out.println(file.exists());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.length());
//		System.out.println("---------------------");
//		System.out.println(path.exists());
//		System.out.println(path.isFile());
//		System.out.println(path.isDirectory());
//		System.out.println(path.length());
		
		File file2 = new File("C:\\study\\sub2");
		file2.mkdirs();
		
		File file3 = new File("C:\\study\\sub2\\t1");
		file3.mkdirs();
		//file3.delete();
	}
}
