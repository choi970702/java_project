package com.ict0.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class study 
{
	// (C:/study/util �� study01.txt���� ����� �̸�, ����, ��ȭ��ȣ �Է�)
	// (C:/study/util �� study01.txt������ �о����)
	// ����� ��ġ�� ������ �Է¹ް�
	// ���̱⸦ �� ��ġ�� ������ �Է� �޾Ƽ� �����ض�
	
	public static void main(String[] args) 
	{
		// ������ ������ ��ġ�� �̸�
		String pathname1 = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		File file1 = new File(pathname1);
		
		// ���̱��� ��ġ
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
