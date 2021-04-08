package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 
{
	public static void main(String[] args) 
	{
		// 작업할 위치 지정 + file지정(file이 존재하지 않음)
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"io_test.txt";
		File file = new File(pathname);
		try 
		{
			// 처음에는 만들어지니까 true, 다음부턴 만들어져 있어서 false
			boolean b1 = file.createNewFile();
			if (b1) 
			{
				System.out.println("파일 생성 성공");
			}else
			{
				System.out.println("파일 생성 실패(같은 이름이 있으면 실패임)");
			}
			
			// 디렉토리 생성
			pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"IO_TEST";
			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if (b2) 
			{
				System.out.println("디렉토리 생성 성공");
			} else 
			{
				// 경로가 틀리거나 똑같은 폴더가 있으면 실패
				System.out.println("디렉터리 생성 실패");
			}
			
			// 디렉토리 삭제 (디렉토리가 비어있어야만 삭제가 가능하다)
			File file3 = new File(pathname);
			boolean b3 = file2.delete();
			if (b3) 
			{
				System.out.println("디렉토리 삭제 성공");
			} else 
			{
				System.out.println("디렉토리 삭제 실패");
			}
			
			// 파일 삭제
			pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+
					"IO_TEST"+file.separator+"io_test.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if (b4) 
			{
				System.out.println("파일 삭제 성공");
			} else 
			{
				System.out.println("파일 삭제 실패");
			}
			System.out.println();
			
			// 경로 표시(지금은 다 똑같이 표시된다.)
			pathname = "C:"+File.separator+"study"+File.separator+"util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
			
			
			
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
		
	}
}
