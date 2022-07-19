package com.naver.lang.String;

public class StringMain1
{
	public static void main(String[] args)
	{
		// String str1 = "iu"; // 리터럴상수
		// String str2 = "iu";
		// String str3 = new String("iu");
		//
		// System.out.println(str1 == str2);
		// System.out.println(str1 == str3);
		// System.out.println(str2);
		// System.out.println(str3);
		// System.out.println("========================");
		//
		// System.out.println(str1.equals(str2)); // String의 내용 비교
		// System.out.println(str1.equals(str3));

		StringStudy_StringLength s = new StringStudy_StringLength();
		// s.studyCharAt();

		StringStudy2_Equal_SubString s2 = new StringStudy2_Equal_SubString();
		// s2.studyIndexOfEx1();
		// s2.studySubString();
		// s2.ex2();

		StringStudy3_Split s3 = new StringStudy3_Split();
		// s3.studySplit();
		// s3.studySplit2();
		s3.studySplit3();
	}
}
