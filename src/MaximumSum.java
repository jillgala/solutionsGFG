
public class MaximumSum {

	public static void main(String[] args) {
		int arr[]= {5,  5, 10, 40, 50, 35};
		int Sum=maxSum(arr);
		System.out.println(Sum);

	}

	public static int maxSum(int[] a) {
		int incl=a[0];
		int excl=0;
		for(int i=1;i<a.length;i++)
		{
			int excl_new=max(incl,excl);
			incl=excl+a[i];
			excl=excl_new;
		}
		return max(incl,excl);
	}

	public static int max(int incl, int excl) {
		if(incl>excl)
		return incl;
		else
			return excl;
	}

}
