package CodingDemo;
public class TrianglePattern {

	static int c=1;
	public static void main(String[] args) {
		int n = 6;
		tri(n);
	}

	public static void tri(int n) {
		for (int i = 0; i<n; i++) {
			for (int space = 1; space<=n-i; space++) {
                     System.out.printf("  ");
			}
			for (int j = 0; j <= i; j++) {
				if(i==0 || j==0)
					c=1;
				else
					c=c*(i-j+1)/j;
				System.out.printf("%4d",c);
			}
			System.out.println("");
		}
	}

}
