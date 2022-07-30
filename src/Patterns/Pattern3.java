package Patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//***
		//**
		//*

		Scanner reader=new Scanner(System.in);
		
		System.out.println(" enter no.of rows");
		
		int row=reader.nextInt();
		
		pattern_3(row);
		

	}
	public static void pattern_3(int num) {
		
		
			
			for (int i=0; i<=num; i++) {
				
				for (int j=0; j<=i;j++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			
			for (int k=0;k<=num-1;k++) {
				
				for (int h=k; h<=num-1;h++) {
					
					System.out.print("*");
				}
				
				System.out.println();
				
			}
			
			
		}
		
	}
	
	
