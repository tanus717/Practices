package CodingDemo;
import java.util.Scanner;

public class SplitUse {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	         s.trim();
	        String s1  = "[ .,?'!]+";
	        String[] token = s.split(s1);
	        
	        System.out.println(token.length);
	        for(int i=0;i<token.length;i++){
	               System.out.println(token[i]);
	            } 
	        scan.close();
	    }
}
