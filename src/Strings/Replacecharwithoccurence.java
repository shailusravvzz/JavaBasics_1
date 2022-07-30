package Strings;

public class Replacecharwithoccurence {

	public static void main(String[] args) {

	String str= "replace occurance with number";
	
	char repalcechar= 'c';
	
		
		if(str.indexOf(repalcechar)==-1) 
		{
			System.out.println("repalcement char not found in input string");
			System.exit(0);
		}
		
	//char[] str= input.toCharArray();		
	int cnt =1;
	
	for(int i= 0; i<str.length();i++) {
		
		char ch=str.charAt(i);
		
		if(ch==repalcechar) {
		str= str.replaceFirst(String.valueOf(repalcechar), String.valueOf(cnt));
		cnt++;
			// String.valueof--- converting char to string
		}
		
	}
	
	System.out.println(str);
		
	}

}
