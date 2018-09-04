package CodingDemo;

public class PrimidNumber {

	public static void main(String[] args) {
		int k=0,count1=0,count=0;
		for (int i = 1; i <6; i++) {
			for (int space = 1; space <= 6 - i; space++) {
				System.out.printf("  ");
				count++;
			}
           while(k  != 2*i-1) {
        	   if(count<=5) {
        		   count++;
        		   System.out.print(" "+(i+k));
        	   }
        	   else {
        		   count1++;
        		   System.out.print(" " + (i+k-2*count1));
        	   }
        	   k++;
           }
           count=count1=k=0;
           System.out.println();
		}
	}
}
