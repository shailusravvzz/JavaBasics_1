package Interview;

public class factorialNumber {

	public static void main(String[] args) {
		
		//!5= 5*4*3*2*1=120
		factnum(5);
		
	}
	
	public static void factnum(int a) {
		
		int sum=1;
		
		for(int i=1;i<=a;i++) {
			
			sum=sum*i;	
			
		}
		
		System.out.println(sum + " is the factorail for "+ a);
	}

}
