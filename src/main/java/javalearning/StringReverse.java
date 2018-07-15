package javalearning;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Name ="Vignesh";
		char[] charArray = Name.toCharArray();
		
/*
		for (int i = charArray.length-1; i >= 0; i--) {
			
			System.out.println(charArray[i]);
		}
*/
	/*	System.out.println(Name.hashCode());
		Name ="Vignesh";
				 
		 System.out.println(Name.hashCode());*/
		 
		/* for (char c : charArray) {
			 System.out.println(charArray);
			
		}*/
		 
		StringBuilder bul = new StringBuilder("Vignesh");
		System.out.println(bul.reverse());
		
		StringBuilder buff = new StringBuilder("Google");
		System.out.println(buff.reverse());
		
		int i=charArray.length-1;
		
		for (char c : charArray) {
			
			
			System.out.println(charArray[i]);
			i--;
		}
		
	}

}
