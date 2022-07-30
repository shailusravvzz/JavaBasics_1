package Interview;

public class FibonacciSeries {

	public static void main(String[] args) {
		// 0,1,1,2,3,5,8,13,21,34..
		FibonacciSeries1(15);
	}
	
	public static void FibonacciSeries1(int a) {
		
		int t1=0;
		int t2=1;
		int sum=0;
		
		for(int i=1; i<=a;i++) 
		{
			
			System.out.println(t1); 
			
			sum=t1+t2; 
			t1=t2;  
			t2=sum; 
			
		}
	}
			

}
