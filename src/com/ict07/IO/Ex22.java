package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 
{
	/*Scanner scan = new Scanner(System.in);
	System.out.println("원하는 문자 입력");
	String msg = scan.next();
	System.out.println("받은 문자 : "+msg);
	*/
	// 입력 : InputStreamReader, 출력 : OutputStreamWriter으로 코딩하시오.
	public static void main(String[] args) 
	{
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		
		
		try 
		{
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			bw.write("원하는 문자를 입력 하시오. : ");
			String msg = br.readLine();
			
			// int k = Integer.parseInt(msg); 받은 문자를 숫자로 변형하는 법
			
			bw.write("받은 문자 : ");
			bw.write(msg);
			
			bw.flush();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bw.close();
				osw.close();
				br.close();
				isr.close();
				
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
	}
}
