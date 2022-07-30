package Strings;

public class RemoveSpecialCharactersFromGivenString {

	public static void main(String[] args) {
		
		String str= "@j@ava#$cou#rse@&";
	
//Approach -1 replace all
		//^ indicates other than
		String PlainStr = str.replaceAll("[^a-zA-Z0-9]" , "");
		System.out.println(PlainStr);

	}

}
