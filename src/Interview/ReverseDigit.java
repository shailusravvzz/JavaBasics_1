package Interview;

public class ReverseDigit {

	public static void main(String[] args) {
	
		ReverseDigit1(1234);
	}
	
	public static void ReverseDigit1(int  a) {
		
		int rev=0;
		int n=0;
		
		while(a!=0) {
			
			n =a%10;        //4 3 2 1 
			rev=rev*10 +n ; // 0*10+4 , 4*10+3, 43*10+2, 432*10+1, 4321
			a=a/10;         // 123,12,2,0
			
			//System.out.print(n);	// without rev		
			
		}
		
		System.out.println("--------------");
		System.out.println(rev);
		
		
				
		
	}

}
