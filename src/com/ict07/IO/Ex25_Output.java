package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex25_Output 
{
	// �̸�, ����, ����, ���� �޾Ƽ�
	// �̸�, ����, ���, �������� ��Ÿ����
	// �迭�� ũ�⸦ �������� ����
	// ��Ÿ�� ������ ����ȭ 09.ser�� ����
	
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict09.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try 
		{
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex25_VO> list = new ArrayList<Ex25_VO>();
			
			esc:
			while (true) 
			{
				System.out.println("�̸� : ");
				String name = scan.next();
				System.out.println("���� : ");
				int kor = scan.nextInt();
				System.out.println("���� : ");
				int eng = scan.nextInt();
				System.out.println("���� : ");
				int math = scan.nextInt();
				
				Ex25_VO vo = new Ex25_VO(name, kor, eng, math);
				list.add(vo);
				while (true) 
				{
					System.out.println("����ұ��?(y/n)");
					String msg = scan.next();
					if (msg.equalsIgnoreCase("y")) 
					{
						continue esc;
					}else if (msg.equalsIgnoreCase("n"))
					{
						break esc;
					}else 
					{
						continue ;
					}
				}
			}
			
			// ��ü ����ȭ
			oos.writeObject(list);
			
			
			
			oos.flush();
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
		
		
	}
	
	
}