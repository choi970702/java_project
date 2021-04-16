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
		// 모든 파일 복사 붙이기(바이트스트림)
		Scanner scan = new Scanner(System.in);
		System.out.println("복사할 장소와 파일명 : ");
		String pathname1 = scan.next();
		
		System.out.println("붙이기할 장소와 이름 : ");
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
			
			// 그림, 소리, 동영상 파일들을 처리할때는 무조건 1byte씩 처리
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
