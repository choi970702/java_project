package com.ict04.exception;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex03 
{
	public static void main(String[] args) 
	{
		// 다중 catch문 : try문의 예외 발생이 여러 가지의 예외가 발생할 경우 사용
		// 주의사항 : Exception은 사용할땐 반드시 가장 아래쪽 catch문을 사용함
		// 어떤수를 받아서 나누기를 함
		
		Scanner scan = new Scanner(System.in);
		/*
		try 
		{
			int var = 3;
			System.out.println("정수를 입력하세요");
			int su = scan.nextInt();
			System.out.println("정답 : "+(var/su));
			
		} catch (InputMismatchException e) 
		{
			System.out.println("정수만 입력 하세요.");
		} catch(ArithmeticException e)
		{
			System.out.println("0 으로는 숫자를 나눌 수 없습니다.");
		} catch (Exception e) 
		{
			System.out.println("제대로 입력 하세요.");
		}*/
		
		try 
		{
			int var = 3;
			System.out.println("정수를 입력하세요");
			int su = scan.nextInt();
			System.out.println("정답 : "+(var/su));
			
		} catch (Exception e) 
		{
			System.out.println("제대로 입력 하세요. " + e);
		}
		
		System.out.println("수고 하셨습니다.");
		
		
		
		
		
		
		
		//
		
	}
	
	
}
