package General;

import java.util.Arrays;
import java.util.stream.Stream;

public class CombineStringArrays {

	public static void main(String[] args) {
		String[] S1= {
				"virat",
				"dhoni",
				"rabin Sharma"};
		
		String[] S2= {
				"KapilDev",
				"Anilkumble",
				"chopra"};
		
		//convert in array streams
		
		Stream <String> S1string = Arrays.stream(S1);
		Stream <String> S2string  = Arrays.stream(S2);
		
		
	String FullTeam[] = Stream.concat(S1string , S2string).toArray(size->new String[size]);
	
	for(String s:FullTeam) {
		System.out.println(s);
	}
	}

}
