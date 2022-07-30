package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharachters {

	public static void main(String[] args) {
	
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter a string");
		
		String str2=reader.next();
		
		CountCharachters_1(str2);

	}

	
	public static void CountCharachters_1(String str) {
		
		char[] word=str.toCharArray();
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(Character ch:word) {
			
			if(map.containsKey(ch)) {
				
				map.put(ch, map.get(ch)+1);
				
			}else
			{
				
				map.put(ch, 1);
			}
			
		}
		
		System.out.println(map);
		
		
		
		
		
		
	}
}
