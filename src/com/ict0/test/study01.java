package com.ict0.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class study01 
{
	// C:/study/util 에 study00.txt파일의 내용을 읽어 오자
	public static void main(String[] args) 
	{
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"study00.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try 
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
}
