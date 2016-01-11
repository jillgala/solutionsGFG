
public class UnionIntersection {

	public static void main(String[] args) {
		int a[]= {1,3,4,5,7};
		int b[]= {2,3,5,6};
		System.out.println("Union array");
		union(a,b);
		System.out.println("Intersection array");
		intersection(a,b);

	}

	public static void intersection(int[] a, int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				i++;
			}
			else if(b[j]<a[i]) {
				j++;
			}
			else if(a[i]==b[j]) {
				System.out.println(b[j]);
				i++;
				j++;
			}
		}
		}
		
	

	public static void union(int[] a, int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}
			else if(b[j]<a[i]) {
				System.out.println(b[j]);
				j++;
			}
			else if(a[i]==b[j]) {
				System.out.println(b[j]);
				i++;
				j++;
			}
		}
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		while(j<b.length) {
			System.out.println(b[j]);
			j++;
		}
		
	}

}
