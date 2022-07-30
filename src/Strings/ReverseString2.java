package Strings;

public class ReverseString2 {

	public static void main(String[] args) {
		
		String str="hello Java";
		
		for (int i=str.length()-1;i>=0; i--) 
		{
			//Important step
			
			char ch=str.charAt(i);
			
			System.out.print(ch);
		}
			
		
	}

}
