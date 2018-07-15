package classwork14072018;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearnMapfunctions {

	public static void main(String[] args) {

		String companyname ="Accenture India";
		String upperCase = companyname.toUpperCase();
		char[] charArray = upperCase.toCharArray();
		for (char eachchar : charArray) {
			System.out.println(eachchar);
		}

		
		Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		
		
		for (char c : charArray) {
			
			if(map.containsKey(c))
				
			{
				map.put(c,map.get(c)+1 );
			}
			else
				map.put(c, 1);
		}
		
		map.remove(' ');
			
		System.out.println(map.entrySet());
		

	}

}
