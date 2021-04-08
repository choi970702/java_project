package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex19 
{
	public static void main(String[] args) 
	{
		// 복사 장소와 파일을 받고
		// 붙이기 장소와 파일명을 받아서 붙이기 한다.
		Scanner scan = new Scanner(System.in);
		System.out.println("복사장소와 파일명 : ");
		String pathname1 = scan.next();
		File file1 = new File(pathname1);
		
		System.out.println("붙이기 장소와 파일명 : ");
		String pathname2 = scan.next();
		File file2 = new File(pathname2);
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try 
		{
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			
			
			String k = null;
			StringBuffer sb = new StringBuffer();
			while ((k = br.readLine()) != null) 
			{
				sb.append(k+"\n");
			}
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			// bw.write(sb.toString());
			String str = sb.toString();
			str = str.replace("대한민국", "大韓民國");
			bw.write(str);
			bw.flush();
			System.out.println(sb.toString());
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bw.close();
				fw.close();
				br.close();
				fr.close();
				
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
}
