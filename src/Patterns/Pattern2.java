package Patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
	
		//****
		//***
		//**
		//*

		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter No.of rows");
		
		int row=reader.nextInt();
		
		Pattern_2(row);
		
	}
	
	public static void Pattern_2(int num) {
		
		for(int i=0;i<=num;i++) {
			
			for(int j=i;j<=num;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}
