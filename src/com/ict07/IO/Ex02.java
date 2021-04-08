package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 
{
	public static void main(String[] args) 
	{
		// File Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		String pathname_1 = "C:\\study\\util"; // �ü���� windows�϶�
		String pathname_2 = "C:/study/util"; // �ü���� Linux, Unix�϶�
		
		// �ü���� ������� ����ϴ� ���
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) 
		{
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			// ��ǻ�Ϳ� ������ �� �ִ� ������ ���丮�� ���� �ۿ� ����.
			
			// ������¥ ���ϱ�(��¥ ���� ����)
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
			
			
			if (file2.isDirectory()) 
			{
				// ���丮�� ũ�Ⱑ �������� ����
				System.out.println("���丮 : " +file2+"\nũ�� : ũŰ�� �������� ����"+
						"������ ��¥ : " + sdf.format(file2.lastModified()));
			}else
			{
				// ������ ũ�� ������
				System.out.println("���� : "+file2+"\nũ�� : "+(int)(file2.length()/1024)+"KB "
								+ "������ ��¥ : "+sdf.format(file2.lastModified()));
			}
			
			
		}
		
		
		
		
		
		
		
	}
}
