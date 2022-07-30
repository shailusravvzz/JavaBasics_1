package Interview;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("plesae enter required number");
		
		int num= reader.nextInt();
		
		EventNumber1(num);
		

	}
	
	public static void EventNumber1(int a) {
		
		if (a%2==0) {
			System.out.println(a + " entered number is event");
		}
		else
			System.out.println(a + " entered number is odd");
		
	}
	
	

}
