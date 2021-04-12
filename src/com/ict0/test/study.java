package com.ict0.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class study 
{
	// (C:/study/util 에 study01.txt파일 만들고 이름, 나이, 전화번호 입력)
	// (C:/study/util 에 study01.txt파일을 읽어오기)
	// 복사될 위치와 파일을 입력받고
	// 붙이기를 할 위치와 파일을 입력 받아서 복붙해라
	
	public static void main(String[] args) 
	{
		// 복사할 파일의 위치와 이름
		String pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		File file1 = new File(pathname1);
		
		// 붙이기할 위치
		String pathname2 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"study00.txt";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try 
		{
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			byte[] b1 = new byte[(int)(file1.length())];
			bis.read(b1);
			String str = new String(b1);
			
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			bos.flush();
			
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) 
			{
				System.out.println(e2);
			}
		}
		
		
		
		
		
		
		
	}
}
