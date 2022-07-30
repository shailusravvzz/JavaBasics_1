package Strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {

		String str="Shailendar";
		
		HashMap<Character,Integer> map= new HashMap<Character, Integer>();
		
				
		for(int i=0; i<str.length();i++) { 
			
			char ch= str.charAt(i); //a 
			
			if(!map.containsKey(ch)) {
				
				map.put(ch, 1);
			}
			
			else {
				
				int cnt=map.get(ch); // to get the value of key
				
				map.put(ch, cnt+1);
			
			}
		}
		
System.out.println(map);
	}

}
