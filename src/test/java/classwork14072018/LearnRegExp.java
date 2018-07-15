package classwork14072018;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegExp {

	public static void main(String[] args) {

		String Name ="Test Leaf(44323) Has Number of   Employee as 20";
		String Patternformat = "([\\d]{2,5})";


		
		Pattern compile = Pattern.compile(Patternformat);
		System.out.println(compile);

		Matcher matcher = compile.matcher(Name);
		//System.out.println(matcher);

		while(matcher.find()) {
		System.out.println(matcher.group());
		}
		 
		System.out.println(Name);
		System.out.println(Name.replaceAll("[^A-Za-z]", ""));
		System.out.println(Name.replaceAll("[^0-9]", ""));
		System.out.println(Name.replaceAll("[A-Za-z0-9]", ""));
		System.out.println(Name.replaceAll("[\\s]+", " "));
		System.out.println("Extra code");
		
		System.out.println("Name is " + Name);
		System.out.println("name was" + Name);	
		



	}

}
