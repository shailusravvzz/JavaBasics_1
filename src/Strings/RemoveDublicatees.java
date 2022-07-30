package Strings;

public class RemoveDublicatees {

	public static void main(String[] args) {
		
		String str= "prograamxming";
		
		char[] strchar= str.toCharArray();
		
		StringBuilder sb1=new StringBuilder();
		
		for(int i=0;i<strchar.length;i++) 
		{
		  boolean repeated= false;
			
			 for(int j=i+1; j<strchar.length;j++) //
			 {
				if(strchar[i]==strchar[j])
				{
					repeated= true;
					break;
				}
			 }
			 
			 if (!repeated) {
				 
				 sb1.append(strchar[i]);
				 				 
			 }
			 
			 
		}
		 System.out.println(sb1);
			
	}

}
