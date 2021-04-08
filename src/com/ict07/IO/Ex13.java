package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex13 
{
	public static void main(String[] args) 
	{
		// DataOutputStream �� DataInputStream
		// �⺻ �ڷ����� �ְ� ���� �� ���(�⺻ �ڷ����� �а� ���� �޼ҵ尡 ������ ����)
		// FileInputStream �� FileOutPutStream�� �ٸ���
		// ���� ������(0, 1)�� ��/����Ҷ� ���(Ÿ �ý��۰� ��/����Ҷ� ����)
		// ���ǻ��� : �Է¼����� ��¼����� �ٸ��� �������� ����� �޶����� �ִ�.
		// BufferedInputStream, BufferedOutputStream�� Ȱ���� �� �ִ�.
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict03.txt";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try 
		{
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			// ���� �޼ҵ� : writeXXX(XXX�� �⺻ �ڷ����� ����)
			// �޸������� ���⸦ �ص� ���� ���� ����.
			dos.writeLong(126l);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			// �д� �޼ҵ� : readXXXX(XXXX�� �⺻ �ڷ����� ����)
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());// ������ �ٲٸ� Ʋ�� �����Ͱ� ���´�.
			System.out.println(dis.readDouble());
		} catch (Exception e) 
		{
			// TODO: handle exception
		}finally
		{
			try 
			{
				dis.close();
				bis.close();
				fis.close();
				dos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) 
			{
				// TODO: handle exception
			}
		}
		
		
		
		
	}

}
