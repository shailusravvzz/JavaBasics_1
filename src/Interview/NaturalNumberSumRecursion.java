package Interview;

public class NaturalNumberSumRecursion {

	public static void main(String[] args) {
		// 5= 5+4+3+2+1=15
		NaturalNumberSumRecursion1(5);
	}
	
	public static void NaturalNumberSumRecursion1(int num) {
		
		int result=0;
		//if(num>=0) {
					
		while(num!=0) {
			
			result=result+num;
			num--;
			
		}
		System.out.println(result);
	//} else
	//	System.out.println("enter correct number");
	}
}
