
public class insertion {

	public static void main(String[] args) {
		int a[]= {3,8,6,7,1,2,11,13,4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j>0; j--) {
				if(a[j]<a[j-1])
				{
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
