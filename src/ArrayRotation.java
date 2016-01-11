import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int d=2;
		System.out.println(Arrays.toString(arr));
		reverse(arr,0,d-1);
		reverse(arr,d,arr.length-1);
		reverse(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}

	public static void reverse(int[] arr,int a, int b) {
		for(int i=a,j=b ;i<=j ; i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		
	}

	
		
	

}
