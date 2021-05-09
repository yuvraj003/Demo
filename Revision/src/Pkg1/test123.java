package Pkg1;

import java.util.Scanner;

public class test123
	{
	
		public static void main(String[] args) 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Value of a:- ");
			int a=s.nextInt();
			s.close();
			
			int b=1;
		
			for (int i=1;i<=a;i++)
			{
				b=b*i;
			}
			
			System.out.println(b);
			
			
			
		}
		
	}