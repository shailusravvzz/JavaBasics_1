package HashMap;

import java.util.*;

public class DublicateCharacter2 {

	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);

		System.out.println("Enter a string");

		String str2=reader.next();

		DublicateCharacter_1(str2);

	}

	public static void DublicateCharacter_1(String str) {

		char[] words=str.toCharArray();

		Map<Character,Integer> map=new HashMap<Character,Integer>();

		for(char ch:words) {

			if(map.containsKey(ch)) {			
				map.put(ch, map.get(ch)+1);
			}else {			
				map.put(ch, 1);

			}			
		}  
		
		//direct printing
		System.out.println(map);
		
		//store and print with entryset****************
		//Map.Entry<Character,Integer>
		
		Set<Map.Entry<Character,Integer>> entryset=map.entrySet();
		
		for(Map.Entry<Character,Integer> entry:entryset) {
			
			if(entry.getValue()>1) {
				
				System.out.println(entry.getKey() + " "+ entry.getValue());
				
			}
		}
		
		
		

	}}
