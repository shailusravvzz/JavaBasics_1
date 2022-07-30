package Interview;

public class DigitsinInteger {

	public static void main(String[] args) {
		DigitsinInteger1(123456);

	}
  
	public static void DigitsinInteger1(long a) {
				
		int count =0;
		
		while(a!=0) 
		{
			a=a/10;
			count++;
			
			System.out.println(a);
			
		}
		
		System.out.println("Numer of digits  " + count);
		
		
		
		
	}
}
