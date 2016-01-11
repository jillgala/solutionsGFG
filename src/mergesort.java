import java.util.Arrays;

public class mergesort {

	public static void main(String[] args) {
		int[] a= {5,8,99,54,27,6,10,77,24,78};
		System.out.println("Unsorted:"+Arrays.toString(a));
		mergesorting(a);
		System.out.println("Sorted:"+Arrays.toString(a));
	}
	public static void mergesorting(int a[]) {
		if(a.length>1)
		{
			int[] left=lefthalf(a);
			int[] right=righthalf(a);
			mergesorting(left);
			mergesorting(right);
			merge(a,left,right);
		}
	}
	public static int[] lefthalf(int[] a) {
		int size1=a.length/2;
		int[] left=new int[size1];
		for (int i = 0; i < left.length; i++) {
			left[i]=a[i];
		}
		return left;
	}
	public static int[] righthalf(int[] a) {
		int size1=a.length/2;
		int size2=a.length-a.length/2;
		int[] right=new int[size2];
		for (int i = 0; i < right.length; i++) {
			right[i]=a[size1+i];
		}
		return right;
	}
	public static void merge(int[] a, int[] left, int[] right) {
		int i1=0;
		int i2=0;
		for (int i = 0; i < a.length; i++) {
			
			if(i2 >= right.length || (i1 < left.length && left[i1]<=right[i2])) {
				a[i]=left[i1];
				i1++;
			}
			else {
				a[i]=right[i2];
			i2++;
			}
		}
		
	}
}










