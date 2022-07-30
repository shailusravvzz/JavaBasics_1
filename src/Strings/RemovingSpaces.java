package Strings;

public class RemovingSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " h e l l o  ";

   for(int i=0; i<=str.length()-1;i++) {

			char ch=str.charAt(i);
			
			if(ch != ' ') 
			System.out.print(ch);
			
			
		}


		
//Approach 2 by repalce all string
		
		//String str2= str.replaceAll(" ", "");
		
		String str2= str.replaceAll("\\s ", "");
		System.out.println(str2);
		
	}

}
