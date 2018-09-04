package DataStructure;

public class InsertionSort {
	public static void main(String[] args) {
		 int [] A  = {4,3,2,1}; 
		 insertion(A);
		display(A);
	}
	public static void insertion(int[] A) {
		int key, j;
		for (int i = 1; i < A.length; i++) {
			key = A[i];
			j = i - 1;
			while ( j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j = j - 1;
			}
			A[j + 1] = key;
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