package Code;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		    char[] ch1  ="School Master".toLowerCase().toCharArray() ;
		    char[] ch2  ="The Classroom" .toLowerCase().toCharArray();
		    anagram(ch1, ch2);
	}
   public static void anagram(char[]s1, char[] s2) {
	                         Arrays.sort(s1);
	                         Arrays.sort(s2);
	                         if(Arrays.equals(s1, s2))
	                        	 System.out.println("Strings are Anagram");
	                         else
	                        	 System.out.println("Strings are not  Anagram");
   }
}
