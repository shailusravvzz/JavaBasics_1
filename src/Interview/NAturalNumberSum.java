package Interview;

public class NAturalNumberSum {

	public static void main(String[] args) {
		
		//1,5== 1+2+3+4+5=15
		
		NAturalNumberSum1(1,5);
		NAturalNumberSum1(2,5);
		NAturalNumberSum1(3,5);
	}
	
	public static void NAturalNumberSum1(int a, int b) {
		int sum = 1;
		
		for (int i=a; i<=b;i++)  // 1
		{
			sum=sum+i; 
		}
		
		System.out.println(sum);
	}

}
