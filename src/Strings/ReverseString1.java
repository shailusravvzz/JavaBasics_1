//https://www.youtube.com/watch?v=2HZ77GR-o84&list=PLpLBSl8eY8jQAscb73Z8Auxi3pEWuiUNx
// array starts from 0

package Strings;

public class ReverseString1 {

	public static void main(String[] args) {
		  
		String str="hello";

			char[] ChArr = str.toCharArray();
		
		for(int i =ChArr.length-1; i>=0; i-- ) 
		{
			System.out.print(ChArr[i]);
		}

// Alternate
		
//		for(int i =str.length()-1; i>=0; i-- ) 
//		{
//			char ch=str.charAt(i);
//			System.out.print(ch);
//			}
		
	
	}

}

