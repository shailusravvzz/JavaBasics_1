package Strings;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		String str="jcba";
		
		char temp;
		
		char[] str1 = str.toCharArray();
			
		for(int i=0; i<str1.length; i++) {
			
			for(int j=i+1; j<str1.length; j++) {
				
				if (str1[i] > str1[j]) {
					
					temp=str1[i];
					str1[i]=str1[j];
					str1[j]=temp;
													
				}
			}
		}
		
		//System.out.println(new String(str1));
		System.out.println(str1);
		
// approach-2
		String str2 ="hello Java";
		char[] str3= str2.toCharArray();
		Arrays.sort(str3);
		
		System.out.println(str3);
		
	}

}
