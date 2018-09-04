package DataStructure;

public class BubbleSort {

	public static void main(String[] args) {
                   int [] A  = {2,3,4,1,6,5,4,7,6,5,11,1,2,1}; 
                     bubble(A);
                     display(A);
	}

	public static void bubble(int[] A) {
		if (A.length == 0 || A.length == 1) {
			return;
		}
		for (int i = 0; i < A.length-1; i++) {
			for (int j = 0; j < A.length-i-1; j++) {
				if (A[j] > A[j + 1]) {
					int temp = A[j];
					A[j] = A[j + 1];
					A[j + 1] = temp;
				}
			}
		}
	}
	public static void display(int[] A) {
		System.out.print("[ ");
		for (int i = 0; i < A.length; i++) {
			   System.out.print(A[i]+", ");
		}
		System.out.print("End  ]");
	}
}
