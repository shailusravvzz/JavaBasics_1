package Patterns;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		/* A 
		   A B 
		   A B C 
		   A B C D   */
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter no.of rows");
		
		int row=reader.nextInt();
		
		pattern_6(row);
		
	}
	
	public static void pattern_6(int num) {
		
		int alpha=65;
		
		for (int i=0; i<=num;i++) {
			
			for (int j=0;j<=i;j++) {
				
				System.out.print ((char)(alpha+j)+ " ");
			}
			
			System.out.println();
		}
	}

}
