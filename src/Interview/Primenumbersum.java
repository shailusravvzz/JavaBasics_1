package Interview;

public class Primenumbersum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//34= 3+31,5+29,11+23,17+17
		
		int num=34;
		boolean flage=false;
		
		for(int i=2;i<=num/2;i++) {
			
			if(checkprimeNumber(i)) {
				if (checkprimeNumber(num-i)){
					System.out.println(num + "=" + " "+ i + "+"+ (num-i));
					flage=true;
				}
			}
				
		}if (!flage)
			System.out.println(" can not be expressed as sum of prime number");
			
			
		
		
	}
	
	
	public static boolean checkprimeNumber(int num) {
		
		boolean isprime=true;
		
		for(int i=2;i<=num/2;i++){
			if(num%i==0){
				isprime=false;
				 break;
		      }
		  	  } 
		
		return isprime;
		
		}
}
