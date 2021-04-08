package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 
{
	public static void main(String[] args) 
	{
		// 문자스트림(사람중심) : 모든 처리를 2byte씩 처리
		// 대상 : 전 세계의 모든 언어로 구성된 문서 파일들
		// 최상위 클래스 : Reader(입력), Writer(출력)
		
		// FileIOutputStream(바이트) : 1bte씩 처리, write(int b), write(byte[] b) 
		// FileWriter(문자) : 2byte씩 처리, write(int b), write(char[] c), write(String str)
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		
		try 
		{
			fw = new FileWriter(file);
			
			// 한글자 쓰기
			fw.write(97); // a
			fw.write(65); // A
			
			// int 이므로 char로 대처할 수 있다.
			fw.write('j');
			fw.write('a');
			fw.write('v');
			fw.write('a');
			fw.write('대'); // FileOutputStream은 한글이 안되지만 FileWriter는 가능함
			fw.write('한');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			char[] c = {'k', 'o', 'r', 'e', 'a', 13, '대', '한', '민', '국'};
			fw.write(c);
			
			fw.write("한국 ICT 인재 개발원\n");
			fw.write("1강의장\n");
			fw.write("자바수업\n");
			
			
			
			
			
			
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
