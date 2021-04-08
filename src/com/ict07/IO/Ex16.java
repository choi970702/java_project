package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 
{
	public static void main(String[] args) 
	{
		// BufferedWrite : 속도향상을 위해 사용, 줄바꾸기 메소드가 존재
		
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try 
		{
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			// 한글자 쓰기
			bw.write(97); // a
			bw.write(65); // A
			
			// int 이므로 char로 대처할 수 있다.
			bw.write('j');
			bw.write('a');
			bw.write('v');
			bw.write('a');
			bw.write('대'); // FileOutputStream은 한글이 안되지만 FileWriter는 가능함
			bw.write('한');
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write(13);
			
			char[] c = {'k', 'o', 'r', 'e', 'a', 13, '대', '한', '민', '국'};
			bw.newLine();
			bw.write(c);
			
			bw.write("한국 ICT 인재 개발원");
			bw.newLine(); // 줄변경 메소드
			bw.write("1강의장");
			bw.newLine();
			bw.write("자바수업");
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
