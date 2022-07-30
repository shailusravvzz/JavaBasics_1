package Strings;

public class ReverseEachWord {

	public static  void rev(String S) {

    String[] strsplit= S.split(" ");   // spilt the word by space
     
     //System.out.println(strsplit.length);
     
     //for (type variableName : arrayName)
              	 
           for(int i=0;i<strsplit.length;i++) 
           {
        	   	String revword=" ";
        	   	
        	   	String word=strsplit[i];
        	   	
        	    for(int j=word.length()-1;j>=0;j--) 
        	    {
        	 
        		   revword=revword+word.charAt(j);
        	    } 
        	       System.out.print(revword+ " ");        	 
           }
	}
	
	
           public static void main(String[] args) {
	       rev("mental fellow");
}


}
