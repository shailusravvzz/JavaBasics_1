package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// starts with 2
		// divisible by 1 and itself
		
		PrimeNumber1(5);
		

	}

	public static void PrimeNumber1(int num) {
		
		boolean flage=false;
		int actualnum=num;
		
		if (num==0 || num==1)
			System.out.println(actualnum+ " Given number is not a prime number");
		
		else
		{
			for(int i=2;i<=num/2; i++) {
				
				if(num%i==0) 
				{
					flage=true;
					break;
					
				}else 
					flage=false;
				
			}
			
			if(!flage)
				System.out.println(actualnum+ " Given number is a prime number");
			else
				System.out.println(actualnum+ " Given number is not a prime number");
		}
	

			
	
	}
}
