package Interview;

public class PallindramNumber {

	public static void main(String[] args) {
		//121= 121
		//454=454
		PallindramNumber1(455);
		PallindramNumber1(454);
	}
	
	public static void PallindramNumber1(int num) {
		int actualnum= num;
		
		int rev=0;
		int temp=0;
		
		while(num !=0) {
			
			temp =num%10;
			rev=rev*10+temp;
			num=num/10;
			
		}
		
		if(rev==actualnum) 
			System.out.println(rev+  " Given number is pallindram");
		else 
			System.out.println(rev +  "  Given number is not a pallindram");
	}

}
