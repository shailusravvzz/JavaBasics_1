package Patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		
	/*   *
	    * *
	   * * *
	  * * * *     same as pattern 4 with spacing only*/
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter no.of rows");
		
		int row=reader.nextInt();
		
		pattern_5(row);

	}
	
	public static void pattern_5(int num) {
		
		for (int i=0; i<=num;i++) {
			
			for(int j=num-1; j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for (int k=0;k<=i;k++) {
				System.out.print(" " +"*");
			}
			
			System.out.println();
		}
		
	}

}
