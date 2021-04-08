package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex10 
{
	public static void main(String[] args) 
	{
		// C:\\study\\util\\test100.txt ���Ͼȿ� 
		// ������ �д� ������ �ۼ��Ͻÿ�.
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"test100.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try 
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bis.close();
				fis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}
