package Interview;

public class PowerConcept {

	public static void main(String[] args) {
		// 3^2=3*3=9
		//3^3=3*3*3=27
		//3^4=3*3*3*3=81
		
		PowerConcept1(2,4);
		PowerConcept1(2,0);

	}

	public static void PowerConcept1(int base, int exponent) {
		
		//with Math function
		//System.out.println(Math.pow(base, exponent));  
				
		long power=1;
		
		for(int i=1; i<=exponent; i++) {
			
			power=power*base;
		}
		
		System.out.println(power);
	}
}
