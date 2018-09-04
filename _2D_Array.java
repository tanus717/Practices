package CodingDemo;
import java.util.Scanner;

public class _2D_Array {
	public static void main(String[] args) {
	     int A[][] = new int[3][3];
	//    int max = Integer.MIN_VALUE;
	    int sum=0;
	    System.out.println(A.length);
	    Scanner sc = new Scanner(System.in);
	    for (int i = 0; i <3; i++) {
			for (int j = 0; j <3; j++) {
				   A[i][j] = sc.nextInt();
			}
		}
        for (int i = 0; i < 3; i++) {
				for (int j = 2-i; j < 3; j++) {
					      sum += A[i][j];
				}
			}
	         System.out.println(sum);
	         sc.close();
}
}
