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
		// 바이트 스트림
		// 속도 향상을 위해서 BufferedOutputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 OutputStream을 받아서 사용한다.
		// 생성자 : BufferedOutputStream(OutputStream out)
		
		
		
		// 특정위치의 파일까지 지정
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try 
		{
			// 기존파일이 있으면 덮어쓰기 하고 없으면 생성한다.
			// try~catch문 사용
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			
			// 한글자 쓰기
			bos.write(65); // A
			bos.write(97); // a
			
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// 자바에서 줄변경 13(Carriage return = CR = \r)이다.
			// 다른 언어줄에는 (\r\n(Line feed = 10)을 같이 사용하는 경우도 있다.)
			bos.write(13);
			
			// 배열을 이용해서 여러글자 쓰기
			byte[] b = {'H', 'i', 'J', 'A', 'V', 'A', 13};
			bos.write(b);
			
			// String을 이용하자(영어 이외의 문자도 가능)
			String str = "Hello\r안녕\r123\r大韓";
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
