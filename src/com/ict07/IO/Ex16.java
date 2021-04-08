package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 
{
	public static void main(String[] args) 
	{
		// BufferedWrite : �ӵ������ ���� ���, �ٹٲٱ� �޼ҵ尡 ����
		
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try 
		{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// �ѱ��� ����
			bw.write(97); // a
			bw.write(65); // A
			
			// int �̹Ƿ� char�� ��ó�� �� �ִ�.
			bw.write('j');
			bw.write('a');
			bw.write('v');
			bw.write('a');
			bw.write('��'); // FileOutputStream�� �ѱ��� �ȵ����� FileWriter�� ������
			bw.write('��');
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			
			char[] c = {'k', 'o', 'r', 'e', 'a', 13, '��', '��', '��', '��'};
			bw.newLine();
			bw.write(c);
			
			bw.write("�ѱ� ICT ���� ���߿�");
			bw.newLine(); // �ٺ��� �޼ҵ�
			bw.write("1������");
			bw.newLine();
			bw.write("�ڹټ���");
			bw.newLine();
			
			
			
			
			
			
			bw.flush();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				bw.close();
				fw.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}
	
	
}
