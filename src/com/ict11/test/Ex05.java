package com.ict11.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Ex05 
{
	public static void main(String[] args) 
	{
		// ��� ���� ���� ���̱�(����Ʈ��Ʈ��)
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ��ҿ� ���ϸ� : ");
		String pathname1 = scan.next();
		
		System.out.println("���̱��� ��ҿ� �̸� : ");
		String pathname2 = scan.next();
		
		File file1 = new File(pathname1);
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
			
			// �׸�, �Ҹ�, ������ ���ϵ��� ó���Ҷ��� ������ 1byte�� ó��
			int k = 0;
			while ((k = bis.read()) != -1) 
			{
				bos.write(k);
			}
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
				bis.close();
				fis.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
	}
}
