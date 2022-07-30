package General;

import java.util.Scanner;

public class MIssingNumber {

	public static void main(String[] args) {
	
 // n*(n+1)/2  total sum
		
		int num[]= {1,2,3,5};
		int n1=findmissingnumber(num,5);
		System.out.println(n1);

	}
	
	public static int findmissingnumber(int num[], int totalCount) {
		int expsum=totalCount*((totalCount+1)/2);
		int acutalsum=0;
		
		for(int i:num) {
			acutalsum +=i;
			
		}
		return expsum-acutalsum;
		
	}

}
