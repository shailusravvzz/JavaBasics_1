package Patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter the no.of rows");
		
		int row =reader.nextInt();
		
		pattern_1(row);

	}
	
	public static void pattern_1(int num) {
		
		for(int i=0; i<=num; i++) {
			
			for (int j=0; j<=i;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
