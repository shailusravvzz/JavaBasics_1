package Interview;

public class Greatestof3Numbers {

	public static void main(String[] args) {
		
		Greatestof3Numbers1(10,15,5);
	}
	
	public static void Greatestof3Numbers1(int a, int b, int c) {
		
		if (a>b && a>c)
			System.out.println(a+ " is the Greatestof3Numbers");
		
		if (b>c)
			System.out.println(b+ " is the Greatestof3Numbers");
		else
			System.out.println(a+ " is the Greatestof3Numbers");
			
		
	}

}
