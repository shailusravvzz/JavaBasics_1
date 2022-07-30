package Interview;

public class ArmStrongNumber {

	public static void main(String[] args) {

		//153= 1*1*1+ 5*5*5 + 3*3*3= 153
		
		ArmStrongNumber1(153);
		
	}
	
	public static void ArmStrongNumber1(int num) {
		
    		
		int acutalnum= num;
		double result=0;
		int temp=0;
		
		int count3=count1(num);
		
		while(num!=0) 
		{		
			temp=num%10;  
			result=result+Math.pow(temp, count3);
			num=num/10;
		}
		
		if (acutalnum==result) 
			System.out.println(acutalnum + "  Given number is Armstrong Numner");
		 else
			System.out.println(acutalnum + "  Given number is not Armstrong Numner");
  } 
	
	
	
	public static int count1(int num2) 
	{   
			
		int count=0;
		
		while(num2!=0) {
			
			num2=num2/10;  
			count++;
		 }
		return count;
     }
}
	