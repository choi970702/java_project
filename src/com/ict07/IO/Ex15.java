package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 
{
	public static void main(String[] args) 
	{
		// ���ڽ�Ʈ��(����߽�) : ��� ó���� 2byte�� ó��
		// ��� : �� ������ ��� ���� ������ ���� ���ϵ�
		// �ֻ��� Ŭ���� : Reader(�Է�), Writer(���)
		
		// FileIOutputStream(����Ʈ) : 1bte�� ó��, write(int b), write(byte[] b) 
		// FileWriter(����) : 2byte�� ó��, write(int b), write(char[] c), write(String str)
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		
		try 
		{
			fw = new FileWriter(file);
			
			// �ѱ��� ����
			fw.write(97); // a
			fw.write(65); // A
			
			// int �̹Ƿ� char�� ��ó�� �� �ִ�.
			fw.write('j');
			fw.write('a');
			fw.write('v');
			fw.write('a');
			fw.write('��'); // FileOutputStream�� �ѱ��� �ȵ����� FileWriter�� ������
			fw.write('��');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			char[] c = {'k', 'o', 'r', 'e', 'a', 13, '��', '��', '��', '��'};
			fw.write(c);
			
			fw.write("�ѱ� ICT ���� ���߿�\n");
			fw.write("1������\n");
			fw.write("�ڹټ���\n");
			
			
			
			
			
			
			fw.flush();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				fw.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}
	
	
}
