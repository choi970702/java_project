package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 
{
	public static void main(String[] args) 
	{
		// C:\\study\\util\\test100.txt ���Ͼȿ�
		// �̸� : 000
		// ���� : 00
		// ��ȭ��ȣ : 000-0000-0000�� �ۼ��ϴ� �ڵ��� �Ͻÿ�.
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"test100.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try 
		{
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String str = "�̸� : ������\r���� : 25\r��ȭ��ȣ : 010-4181-1836";
			byte[] b = str.getBytes();
			bos.write(b);
			bos.flush();
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bos.close();
				fos.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
