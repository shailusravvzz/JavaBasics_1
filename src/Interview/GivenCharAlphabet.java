package Interview;

public class GivenCharAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GivenCharAlphabet1('#');
	}

	public static void GivenCharAlphabet1(char a) {
		
		if((a>='a' && a<='z')|| (a>='A' && a<='Z'))
		{
			System.out.println(a + "  Given character is a alphabet");
		}
		else
			System.out.println(a + "  Given character is not a alphabet");
			
		
	}
}
