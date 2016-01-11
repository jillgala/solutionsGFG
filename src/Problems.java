
public class Problems {

	public static void main(String[] args) {
		int[] A= {1,3,5,7,9,11,13,15};
		selectionsort(A);
		printArray(A);
	}

	private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void selectionsort(int[]A) {
		
		for (int i = 0; i < A.length; i++) {
			int index=findMax(A, 0, A.length-i);
			swap(A,index,A.length-1-i);
		}
	}
		

	private static void swap(int[] A, int index, int i) {
		int temp=A[index];
		A[index]=A[i];
		A[i]=temp;
	}

	private static int findMax(int[] A, int start, int end) {
		int index=0,max=A[0];
		for (int i = start; i < end; i++) {
			if(max<A[i]) {
				index=i;				
				max=A[i];
			}
		}
		return index;
	}	
}













