package CodingDemo;


public class SumOfTwoNum {

	public static void main(String[] args) {
		        int [] A = {12,45,78,89,95,99,123,654,789,895,905,995,1005};
                System.out.println(sum(A,1005));
            
	}
	private static int  sum(int[] A,int key) {
		       int low=0;
		       int high=A.length-1;
		       while(low<=high) {
		    	   int mid=(low+high)/2;
		    	   if(A[mid]==key)
		    		  return mid;
		    	   if(mid<key)
		    		   low=mid+1;
		    	   else
		    		   high=mid-1;
		       }
		       return -1;
	}

}
