package Interview;

public class PrintAsciiNumber {

	public static void main(String[] args) {
	
		AsciiNumber('a');
	}
	
	
	public static void AsciiNumber(char ch) {
		
		int asciivar=ch; // converting char to ASCII value
		
	    //int asciivar1=(int)ch; //one more way
	
		System.out.println(asciivar);
	}

}
