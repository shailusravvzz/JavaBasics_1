package Interview;

public class LeapYear {

	public static void main(String[] args) {
	
		// divisible by 4 for all century years--ending with 00
		// century year divided by 400 

		
		Leapyear1(2012); //leap year.
		Leapyear1(1900); //is not a leap year.
		
	}

	public static void Leapyear1(int a) 
	{
		boolean leapyear=false;
		
		if (a%4==0) 
		{
			if (a%100==0) //century year
			{
				if(a%400==0) //century year divisible by 400
				{
					leapyear=true;
				}	
				else {
					leapyear=false;
					}
			
			}else {
				
				leapyear=true; //divisible by 4 and not a century year
					}
			
		} 
		
			if(leapyear) 
				System.out.println(a + " given year is Leap Year");
				else 
				System.out.println(a + " given year is not a Leap Year");
		}
	}
