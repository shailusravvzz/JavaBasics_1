package Strings;

public class FirstnonRepeatedChar {

	public static void main(String[] args) {
		String str1="welcome to world";
		
				
		for(int i=0; i<str1.length();i++) 
		{
			
			boolean unique=true;
			
			for(int j=0;j<str1.length();j++) 
			{
				if(i !=j && str1.charAt(i)==str1.charAt(j)) 
				{
					unique=false;
									
				}
				
			}	
			
			if(unique) {
				System.out.println(str1.charAt(i));
				break;
			}
			
		}
				

	}

}
