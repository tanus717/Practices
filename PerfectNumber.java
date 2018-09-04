package CodingDemo;

public class PerfectNumber {

	public static void main(String[] args) {
		int n =28;
		int sum  = 0 ;
		for (int  i = 1; i < n; i++) {
			if( n%i==0) {
				sum  = sum +  i;
			}
		}
		if(n==sum) {
			 System.out.print("   PN   : " + n);
		}
		else
		{
			System.out.println("Not");
		}
	}
}
