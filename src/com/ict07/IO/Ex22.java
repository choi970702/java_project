package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 
{
	/*Scanner scan = new Scanner(System.in);
	System.out.println("���ϴ� ���� �Է�");
	String msg = scan.next();
	System.out.println("���� ���� : "+msg);
	*/
	// �Է� : InputStreamReader, ��� : OutputStreamWriter���� �ڵ��Ͻÿ�.
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
			
			bw.write("���ϴ� ���ڸ� �Է� �Ͻÿ�. : ");
			String msg = br.readLine();
			
			// int k = Integer.parseInt(msg); ���� ���ڸ� ���ڷ� �����ϴ� ��
			
			bw.write("���� ���� : ");
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
