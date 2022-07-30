package Interview;

import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("enter English Charater");
		
		char c=reader.next().charAt(0);
				
		VowelAndConsonant1(c);
	}
	
	public static void VowelAndConsonant1(char ch) {
		
		if(ch=='a'|| ch=='e' || ch=='i' ||ch=='o' ||ch=='u' ) {
			
			System.out.println(ch + " Given Char is Vowel");
		}
		else {
			System.out.println(ch + " Given Char is Consonant");
	}
	
	//second case
		
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
		System.out.println(ch+ " Given Char is Vowel");
		break;
		
		default:
		System.out.println(ch + " Given Char is Consonant");
		
	}
}

}
