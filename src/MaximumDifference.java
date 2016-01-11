
public class MaximumDifference {

	public static void main(String[] args) {
		int arr[]= {2,3,10,6,4,8,1,12};
		int a=maxdiff(arr);
		System.out.println(a);
	}

	public static int maxdiff(int[] arr) {
		int minelement=arr[0];
		int maxdiff=arr[1]-arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<minelement)
				minelement=arr[i];
			if(arr[i]-minelement>maxdiff)
				maxdiff=arr[i]-minelement;
		}
		return maxdiff;
	}

}
