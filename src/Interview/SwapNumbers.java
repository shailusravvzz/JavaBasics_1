package Interview;

public class SwapNumbers {

	public static void main(String[] args) {
		SwapNumber1(20,10);
		SwapNumber2(40,50);

	}
	
	public static void SwapNumber1(int a, int b) {
		
		int temp;
		
		System.out.println("Before swapping a= " + a);
		System.out.println("Before swapping b= " + b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Aefore swapping a= " + a);
		System.out.println("Aefore swapping b= " + b);
		
	}
	
public static void SwapNumber2(int a, int b) {
		
		//without temp variable
		
		System.out.println("Before swapping a= " + a);
		System.out.println("Before swapping b= " + b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("Aefore swapping a= " + a);
		System.out.println("Aefore swapping b= " + b);
		
	}

}
