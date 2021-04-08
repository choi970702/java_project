package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 
{
	public static void main(String[] args) 
	{
		// File 클래스를 사용하기 전에 특정 위치를 지정
		String pathname_1 = "C:\\study\\util"; // 운영체제가 windows일때
		String pathname_2 = "C:/study/util"; // 운영체제가 Linux, Unix일때
		
		// 운영체제와 상관없이 사용하는 방법
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) 
		{
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			// 컴퓨터에 저장할 수 있는 종류는 디렉토리와 파일 밖에 없다.
			
			// 수정날짜 구하기(날짜 형식 지정)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			
			if (file2.isDirectory()) 
			{
				// 디렉토리는 크기가 존재하지 않음
				System.out.println("디렉토리 : " +file2+"\n크기 : 크키가 존재하지 않음"+
						"수정한 날짜 : " + sdf.format(file2.lastModified()));
			}else
			{
				// 파일은 크기 존재함
				System.out.println("파일 : "+file2+"\n크기 : "+(int)(file2.length()/1024)+"KB "
								+ "수정한 날짜 : "+sdf.format(file2.lastModified()));
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
