package CodingDemo;
import java.util.ArrayList;
public class LeftRotation {
	public static void main(String[] args)  {
		int[] a = { 1, 2, 3 };
		   System.out.println(permute(a));
	}
	static  ArrayList<ArrayList<Integer> > permute(int[] a) {
		ArrayList<ArrayList<Integer>> result =  new ArrayList<>();
			permute(a,0,result);
			return result;
	}
	static void permute(int[] a, int start, ArrayList<ArrayList<Integer>> result) {
		if (start >= a.length) {
			ArrayList<Integer> item = convertArrayToList(a);
			result.add(item);
		} else {
			for (int i = start; i < a.length; i++) {
                 swap(a, start, i);
                	permute(a,start+1,result);
                	  swap(a, start, i);
			}
		}
	}

	private static  ArrayList<Integer> convertArrayToList(int[] num) {
		ArrayList<Integer> item = new ArrayList<Integer>();
		for (int h = 0; h < num.length; h++) {
			item.add(num[h]);
		}
		return item;
	}
static 	public void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
