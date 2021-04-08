package com.ict07.IO;

// 시험문제 String이용하는거
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 
{
	public static void main(String[] args) 
	{
		// 바이트 스트림
		// 속도 향상을 위해서 BufferedInputStream을 사용한다.
		// 혼자서는 사용할 수 없고 반드시 InputStream을 받아서 사용한다.
		// 생성자 : BufferedInputStream(InputStream in)
		
		
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try 
		{
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// 한글자 읽어오기 : read() => 아스키코드 숫자로 나옴 => 형변환
			// int k = bis.read();
			// System.out.println(k+" : "+(char)(k));
			
			// 한긓자씩 계속 읽기 : 그림, 소리, 동영상, 파일을 읽을때 무조건 해당 형식을 사용
			//					비영어권인 문자는 읽을 수 없다.
			
			/*int k = 0;
			while (true) 
			{
				k = bis.read();
				if (k == -1) break;
				System.out.println(k+" : "+(char)(k));
			}*/
			
			/* int k = 0;
			// 즉, bis를 이용해서 읽었을때 -1과 같지 않으면 실행해라.
			while((k=bis.read()) != -1) 
			{
				System.out.println(k+" : "+(char)(k));
			}*/
			
			// 배열을 이용하는 방법 : 비영어권 문자 사용 못함
			/*byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			for (byte k : b) 
			{
				System.out.println(k+" : "+(char)(k));
			}*/
			
			// String을 이용하자(영어 이외의 문자도 가능)
			// String 생성자에 byte[]을 받는 생성자를 이용하면 된다.
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
				fis.close();
			} catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
