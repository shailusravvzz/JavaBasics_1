package Strings;

import java.util.HashMap;
import java.util.Map;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

     
     Map<Character, Integer> map= new HashMap<Character, Integer>();

     String Str= "abafk";
     
     char[] str2=Str.toCharArray();
     
     
     for(int i=0; i<str2.length; i++)
     {
    	 
         for(int j=i+1; j<str2.length; j++)
         {
        	 int  cnt = 1; 
        	 
             if (!(str2[i]==str2[j]))  //a
             {
                 map.put(str2[i],cnt);
             }
                 else
                 {
                	break;               
                 } 
             
             cnt=map.get(str2[i])+1;
             
             map.put(str2[i],cnt);
          }                                           
         
         }    
     System.out.print(map);  
	}
      
  

	}

