package com.ict07.IO;

// ���蹮�� String�̿��ϴ°�
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 
{
	public static void main(String[] args) 
	{
		// ����Ʈ ��Ʈ��
		// �ӵ� ����� ���ؼ� BufferedInputStream�� ����Ѵ�.
		// ȥ�ڼ��� ����� �� ���� �ݵ�� InputStream�� �޾Ƽ� ����Ѵ�.
		// ������ : BufferedInputStream(InputStream in)
		
		
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try 
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// �ѱ��� �о���� : read() => �ƽ�Ű�ڵ� ���ڷ� ���� => ����ȯ
			// int k = bis.read();
			// System.out.println(k+" : "+(char)(k));
			
			// �уR�ھ� ��� �б� : �׸�, �Ҹ�, ������, ������ ������ ������ �ش� ������ ���
			//					�񿵾���� ���ڴ� ���� �� ����.
			
			/*int k = 0;
			while (true) 
			{
				k = bis.read();
				if (k == -1) break;
				System.out.println(k+" : "+(char)(k));
			}*/
			
			/* int k = 0;
			// ��, bis�� �̿��ؼ� �о����� -1�� ���� ������ �����ض�.
			while((k=bis.read()) != -1) 
			{
				System.out.println(k+" : "+(char)(k));
			}*/
			
			// �迭�� �̿��ϴ� ��� : �񿵾�� ���� ��� ����
			/*byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			for (byte k : b) 
			{
				System.out.println(k+" : "+(char)(k));
			}*/
			
			// String�� �̿�����(���� �̿��� ���ڵ� ����)
			// String �����ڿ� byte[]�� �޴� �����ڸ� �̿��ϸ� �ȴ�.
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
			
		} catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally
		{
			try 
			{
				bis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}