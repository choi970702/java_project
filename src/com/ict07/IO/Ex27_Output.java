package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output 
{
	public static void main(String[] args) 
	{
		// 이름, 국어, 영어, 수학 받아서
		// 이름, 총점, 평균, 학점으로 나타내기
		// 배열의 크기를 지정하지 않음
		// 나타낸 정보를 직렬화 09.ser로 저장
		Scanner scan = new Scanner(System.in);
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict11.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try 
		{
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<Ex27_VO> list = new ArrayList<Ex27_VO>();
			esc:
			while (true) 
			{
				System.out.println("이름 : ");
				String name = scan.next();
				System.out.println("국어점수 : ");
				int kor = scan.nextInt();
				System.out.println("영어점수 : ");
				int eng = scan.nextInt();
				System.out.println("수학점수 : ");
				int math = scan.nextInt();
				Ex27_VO vo = new Ex27_VO(name, kor, eng, math);
				list.add(vo);
				while (true) 
				{
					System.out.println("계속 하시겠습니까?(y/n)");
					String msg = scan.next();
					if (msg.equalsIgnoreCase("y")) 
					{
						continue esc;
					} else if(msg.equalsIgnoreCase("n"))
					{
						break esc;
					}else
					{
						continue;
					}
				}
				
			}
			
			oos.writeObject(list);
			
			
			oos.flush();
		} catch (Exception e) 
		{
			System.out.println(e);
		}finally
		{
			try 
			{
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) 
			{
				System.out.println(e2);
			}
		}
		
		
		
		
		
	}
	
	
	
}
