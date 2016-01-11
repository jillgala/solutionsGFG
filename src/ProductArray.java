
public class ProductArray {

	public static void main(String[] args) {
		int a[]= {10,2,5,3,7};
		product(a);

	}

	public static void product(int[] a) {
	int []left=new int[a.length];
	int []right=new int[a.length];
	int []prod=new int[a.length];
	left[0]=1;
	right[a.length-1]=1;
	
	for (int i = 1; i < a.length; i++) {
		left[i]=a[i-1]*left[i-1];
	}
	
	for(int i=a.length-2;i>=0;i--) {
		right[i]=right[i+1]*a[i+1];
	}
	for(int i=0;i<a.length;i++) {
		prod[i]=left[i]*right[i];
		System.out.println(prod[i]);
	}
		
	}

}
