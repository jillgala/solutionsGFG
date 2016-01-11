
public class Bubblesort {

	public static void main(String[] args) {
		int A[]= {100,90,5,8,6,11,7,3,1,2};
		
		for (int i = 0; i < A.length-2; i++) {
			for (int j = 0; j < A.length-1; j++) {
				if(A[j]>A[j+1])
				{
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
				}
			}
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}
		}
	}


