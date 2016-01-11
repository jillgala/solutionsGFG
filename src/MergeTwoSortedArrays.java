import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr= {2, 8, -1, -1, -1, 13, -1, 15, 20};
		int[] N= {5, 7, 9, 25};
		 int n=N.length;
		 int m=(arr.length)-n;
		move(arr);
		merge(arr,N,m,n);
		System.out.println(Arrays.toString(arr));
	}

	private static void merge(int[] arr, int[] N, int m, int n) {
		int i=n;  
		int j=0;
		int k=0;
		while(j<(m+n)) {
			if(k==n || arr[i]<=N[k] && i<(m+n)) {
				arr[j]=arr[i];
				j++;
				i++;
			}
			else  {
				arr[j]=N[k];
				j++;
				k++;
			}
		}
			
		
		
	}

	private static void move(int[] arr) {
		int x=arr.length-1;
		for (int i = arr.length-1; i >=0; i--) {
			if(arr[i]!=-1) {
				arr[x]=arr[i];
				x--;
			}
		}
		
	}

}
