package DataStructure;

public class SelectionSort {

	public static void main(String[] args) {
	     int [] A  = {2,3,4,1,6,5,4,7,6,5,11,1,2,1}; 
	     selection(A);
	     display(A);
	}

	public static void selection(int[] A) {
		for (int j = 0; j < A.length; j++) {
			int min = j;
			for (int k = j + 1; k < A.length; k++)
				if (A[min] > A[k])
					min = k;

			int temp = A[min];
			 A[min] = A[j];
			 A[j] = temp;
			 }

	}

	public static void display(int[] A) {
		System.out.print("[ ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.print("End  ]");
	}
}
