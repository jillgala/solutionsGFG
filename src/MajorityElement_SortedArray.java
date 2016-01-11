
public class MajorityElement_SortedArray {

	public static void main(String[] args) {
		int arr[] = { 1, 4, 4, 4, 4, 4, 4, 5, 5, 7 };
		int x = 4;
		int low = 0;
		int high = arr.length - 1;
		int index = binarysearch(arr, low, high, x);
		System.out.println(index);
		if (checkmajority(arr, index, x))
			System.out.println("It occurs more than n/2 times");
		else
			System.out.println("It doesnt occur more than n/2 times");

	}

	public static boolean checkmajority(int[] arr, int index, int x) {
		int n = arr.length;
		if (index+n/2<n && arr[index + n / 2] == x)
			return true;
		else
			return false;
	}

	public static int binarysearch(int[] arr, int low, int high, int x) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if ((x > arr[mid-1]) && (arr[mid] == x))
				return mid;
			if (x > arr[mid])
				return binarysearch(arr, mid + 1, high, x);
			else
				return binarysearch(arr, low, mid - 1, x);
		}
		return -1;
	}

}
