import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {5,7,1,4,9,0,51,6};
		for(int i=0,j= arr.length-1 ;i<=j ; i++,j--) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
