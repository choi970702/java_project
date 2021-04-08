package com.ict0.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class study00 
{
	// C:/study/util 에 study00.txt파일 만들고 이름, 나이, 전화번호 입력
	public static void main(String[] args) 
	{
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"study00.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try 
		{
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
			String str = "이름 : 최현규\r나이 : 25\r번호 : 010-4181-1836";
			byte[] b = str.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			try 
			{
				bos.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
}
