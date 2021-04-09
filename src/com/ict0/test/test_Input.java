package com.ict0.test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class test_Input 
{
	public static void main(String[] args) 
	{
		// �̸�, ����, ����, ���� �޾Ƽ�
		// �̸�, ����, ���, �������� ��Ÿ����
		// �迭�� ũ�⸦ �������� ����
		// ��Ÿ�� ������ ����ȭ test00.ser�� ����
		Scanner scan = new Scanner(System.in);
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"test00.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try 
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			
			ArrayList<test_VO> list = (ArrayList<test_VO>)(ois.readObject());
			test_VO[] arr = (test_VO[])(list.toArray());
			test_VO tmp = new test_VO();
			
			for (int i = 0; i < arr.length; i++) 
			{
				for (int j = 0; j < arr.length; j++) 
				{
					if(arr[i].getSum() > arr[j].getSum())
					{
						arr[j].setRank(j);
					}
				}
				
			}
			
			
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
	}
}
