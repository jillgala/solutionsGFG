
public class Leader_Array {

	public static void main(String[] args) {
		int a[] = {16, 17, 4, 3, 5, 2, 1};
		int n=a.length-1;
		int max=a[n];
		System.out.println(max);
		for (int i = n-1; i>=0;i--) {
			if(a[i]>max) {
				System.out.println(a[i]);
				max=a[i];
			}
		}
		

	}

}
