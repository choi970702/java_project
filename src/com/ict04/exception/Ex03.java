package com.ict04.exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex03 
{
	public static void main(String[] args) 
	{
		// ���� catch�� : try���� ���� �߻��� ���� ������ ���ܰ� �߻��� ��� ���
		// ���ǻ��� : Exception�� ����Ҷ� �ݵ�� ���� �Ʒ��� catch���� �����
		// ����� �޾Ƽ� �����⸦ ��
		
		Scanner scan = new Scanner(System.in);
		/*
		try 
		{
			int var = 3;
			System.out.println("������ �Է��ϼ���");
			int su = scan.nextInt();
			System.out.println("���� : "+(var/su));
			
		} catch (InputMismatchException e) 
		{
			System.out.println("������ �Է� �ϼ���.");
		} catch(ArithmeticException e)
		{
			System.out.println("0 ���δ� ���ڸ� ���� �� �����ϴ�.");
		} catch (Exception e) 
		{
			System.out.println("����� �Է� �ϼ���.");
		}*/
		
		try 
		{
			int var = 3;
			System.out.println("������ �Է��ϼ���");
			int su = scan.nextInt();
			System.out.println("���� : "+(var/su));
			
		} catch (Exception e) 
		{
			System.out.println("����� �Է� �ϼ���. " + e);
		}
		
		System.out.println("���� �ϼ̽��ϴ�.");
		
		
		
		
		
		
		
		//
		
	}
	
	
}
