package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 
{
	public static void main(String[] args) 
	{
		// ����Ʈ ��Ʈ��
		// �ӵ� ����� ���ؼ� BufferedOutputStream�� ����Ѵ�.
		// ȥ�ڼ��� ����� �� ���� �ݵ�� OutputStream�� �޾Ƽ� ����Ѵ�.
		// ������ : BufferedOutputStream(OutputStream out)
		
		
		
		// Ư����ġ�� ���ϱ��� ����
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try 
		{
			// ���������� ������ ����� �ϰ� ������ �����Ѵ�.
			// try~catch�� ���
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
			// �ѱ��� ����
			bos.write(65); // A
			bos.write(97); // a
			
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// �ڹٿ��� �ٺ��� 13(Carriage return = CR = \r)�̴�.
			// �ٸ� ����ٿ��� (\r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			bos.write(13);
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'H', 'i', 'J', 'A', 'V', 'A', 13};
			bos.write(b);
			
			// String�� �̿�����(���� �̿��� ���ڵ� ����)
			String str = "Hello\r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			
			
			
			
			bos.flush();
			
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally 
		{
			try 
			{
				bos.close();
				if (fos !=null) fos.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
