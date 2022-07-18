package com.naver.lang.String;

public class StringStudy2
{
	public void studyIndexOfEx1()
	{
		String names = "iu,suji,choa,hani";
		// 1.names 의 쉼표갯수
		boolean ch = true;
		int index = 0; // , 를 찾은 인덱스 번호
		int count = 0; // 쉼표의 갯수를 담을 변수
		while (ch)
		{
			index = names.indexOf(",", index);

			if (index == -1) // , 를 못찾은 경우
			{
				break;
			}
			else // , 를 찾았을 때
			{
				count++;
				index++;
			}
		}
		System.out.println(", 의 갯수: " + count);
		// 2. 총 몇명인지
		System.out.println("인원 수: " + (count + 1));
	}

	public void studyIndexOf()
	{
		String str = "Hello Java";

		int index = str.indexOf('l');
		System.out.println(index);

		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);

		str = "Google에 입사 지원 동기는... Google에 입사하면..";
		System.out.println(str);
		String re = str.replace("Google", "samsung"); // replace -> 왼쪽 문자를 오른쪽으로 변경
		System.out.println(re);

		str = "hi";
		String str2 = "h i";
		str2 = str2.trim();
		str2 = str2.replace(" ", "");
		System.out.println(str.equals(str2));
	}

	public void studySubString()
	{
		// 하나의 문자열을 분리하는 작업
		String member = "iu/1234"; // 아이디/비밀번호
		String pw = member.substring(3); // 3 - 자르는 인덱스 위치
		String id = member.substring(0, 2); // 인덱스 0번부터 인덱스 2번까지 사용해야 함
		System.out.println(id);
		System.out.println(pw);
	}

	public void ex2()
	{
		// 키보드로부터 파일명 입력 - abc.txt
		// 파일이 이미지파일인지 아닌지 구별 - 맞으면 이미지 파일, 아니면 이미지 파일 아님 출력
		// 확장자: png, jpg, jpeg
		String[] file = { "png", "jpg", "jpeg" };
		String filename = "abc.test.jpeg";

		int index = filename.lastIndexOf("."); //

		filename = filename.substring(index + 1);
		System.out.println(filename);
		// if (filename.equals("jpg") || filename.equals("png") || filename.equals("jpeg"))
		String rs = "이미지 파일이 아닙니다.";
		for (int i = 0; i < file.length; i++)
		{
			if (filename.equals(file[i]))
			{
				rs = "이미지 파일입니다.";
				break;
			}
		}
		System.out.println(rs);
	}
}
