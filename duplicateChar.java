package CodingDemo;
import java.util.Scanner;

class duplicateChar {
            public static void main(String[] args) {
				      String s ="aabbc";
				      int l = s.length();
				      int count=0;
				      char [] ch = s.toCharArray();
				        for (int i = 0; i < l; i++) {
				        	
				        	for (int j = 0; j < l; j++) {
				        		if(ch[i]==ch[j] && i>j)
					        		break;
								  if(ch[i]==ch[j]) {
									     count++;
								  }
								  if(j==l-1)
									System.out.println(ch[i]+">................>"+count);
							}
		                  
		                  	count=0;
						}
			}
        
}