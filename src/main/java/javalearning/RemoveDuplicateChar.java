package javalearning;


import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String Comp ="google";
/*	
	Set<Character> Company = new LinkedHashSet<Character>();
	
	char[] charArray = Comp.toCharArray();
	
	for (char c : charArray) {
		Company.add(c);
	}

	System.out.println(Company);
*/
	List<Character> Company1 = new ArrayList<Character>();
	
char[] charArray = Comp.toCharArray();
	
	for (char c : charArray) {
	
		if(!Company1.contains(c))
		Company1.add(c);
	}
	
	System.out.println(Company1);
	
	
	}
}



