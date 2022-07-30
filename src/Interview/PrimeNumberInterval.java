package Interview;

public class PrimeNumberInterval {

	public static void main(String[] args) {
		PrimeNumberInterval1(10,50);

	}

	public static void PrimeNumberInterval1(int low,int high) {
		boolean flage=false;
		
		while(low<high){			
			
			for(int i=2; i<low/2;i++) 
			{
				if(low%i==0) 
					{
					flage=true;
					break;				
					} 
				else 
					flage=false;				
			} 
			
			if(!flage) {
				System.out.println(low);
			} 
			 low++;
			
			
		}
		
	}
	
}
	

